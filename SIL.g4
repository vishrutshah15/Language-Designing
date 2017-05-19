grammar SIL;

@header {
import java.util.*;
}

@members {
/** Map variable name to Integer object holding value */
HashMap memory = new HashMap();
Scanner keyboard = new Scanner(System.in);

}

program: stat+ ;

stat:
        'PRINT' exLit+ NEWLINE {System.out.print($exLit.value);}
    |   'PRINTLN' exLit+ NEWLINE {System.out.println($exLit.value);}
    |   'INTEGER' integer NEWLINE
    |   'INPUT' input NEWLINE
    |   'LET' let NEWLINE
    |   'END' {System.exit(0);}
    |   NEWLINE
    ;

integer:
   ids+=ID (',' ids+=ID)*
        {
            for(Token idT : $ids) {
                String id=idT.getText();
                if(!memory.containsKey(id)) memory.put(id, null);
                else {
                    System.err.println("variable already defined: "+id);
                    System.exit(0);
                }
            }
        };

let:
   ID '=' expr
        {
            if(memory.containsKey($ID.text)) memory.put($ID.text, new Integer($expr.value));
            else {
              System.err.println("variable not defined: "+$ID.text);
              System.exit(0);
            }
        };

input:
   ids+=ID (',' ids+=ID)*
        {
            for(Token idT : $ids) {
                String id=idT.getText();
                if(memory.containsKey(id)) {
                    int a = keyboard.nextInt();
                    memory.put(id, a);
                } else {
                    System.err.println("variable not defined: "+$ID.text);
                    System.exit(0);
                }
            }
        };

exLit returns [String value]
    :   e=exprLit1 {$value=$e.value;} ('+' e=exprLit1 {$value+=$e.value;}|COMMENT)*;

exprLit1 returns [String value]
    :   e=expr {$value=String.valueOf($e.value);}
    |   LITERAL {$value = $LITERAL.text.substring(1,$LITERAL.text.length()-1);}
    ;

expr returns [int value]
    :   e=mulEx {$value = $e.value;}
        (   '+' e=mulEx {$value += $e.value;}
        |   '-' e=mulEx {$value -= $e.value;}
        )*
    ;

mulEx returns [int value]
    :   e=at {$value = $e.value;}
        ('*' e=at {$value *= $e.value;}
    	|'/' e=at {$value /= $e.value;}
    								)*
    ;

at returns [int value]
    :   INT {$value = Integer.parseInt($INT.text);}
    |   ID
        {
        Integer v = (Integer)memory.get($ID.text);
        if ( v==null ) System.err.println("variable not defined: "+$ID.text);
        else $value = v.intValue();
        }
    |   '(' expr ')' {$value = $expr.value;}
    ;

ID  :   [a-zA-Z]+ [a-zA-Z0-9_]* ;
INT :   '-'?[0-9]+ ;
NEWLINE: '\r'? '\n' ;
WS  :   [ \t]+ -> skip;
COMMENT : '//' (~'\n')* -> skip;
LITERAL :   '"' .*? '"' ;
