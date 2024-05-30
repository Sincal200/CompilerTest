grammar test;

prog: (decl | expr)+ EOF #Program
    ;

decl: ID ':' INT_TYPE '=' NUM #Delcaration
    ;
 //ANTLR resolves the ambiguity by choosing the first alternative in the rule.
expr: expr '*' expr     #Modification
    | expr '+' expr     #Addition
    | expr '-' expr     #Subtraction
    | expr '/' expr     #Division
    | expr '^' expr     #Power
    | ID                #Variable
    | NUM               #Number
    ;

//TOKENS
ID: [a-z][a-zA-Z0-9_]*;
NUM: '0' | '-'?[1-9][0-9]*;
INT_TYPE: 'INT';
COMMENT: '--' ~[\r\n]* -> skip;
WS: [ \t\n\r]+ -> skip;



