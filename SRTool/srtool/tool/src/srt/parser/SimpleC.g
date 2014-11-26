grammar SimpleC;

options {
  language = Java;
  //k = 1;
  //backtrack = false;
  //buildAST = true;
  output = AST;
}

tokens {
PROGRAM;
COMPOUND_STATEMENT;
BLOCK;
DECL;
UPLUS;
UMINUS;
INVARIANT_LIST;
REQUIRED_INV;
CANDIDATE_INV;
BOUND;
EMPTY_STMT;
DECL_LIST;
}

@header {
  package srt.parser;
}

@lexer::header {
  package srt.parser;
}


start:
  'void' ID '(' declList ')' block EOF -> ^(PROGRAM ID declList block)
;

declList: ( decl ( ',' decl)*)? -> ^(DECL_LIST decl*)
;

compoundStmt:
 statement*    -> ^(COMPOUND_STATEMENT statement*)
;

statement:
(terminatedStatement ';'!
  |nonterminatedStatement)
;

nonterminatedStatement:
   block
 | ifStatement
 | whileStatement
;

block:
 '{' compoundStmt '}' -> ^(BLOCK compoundStmt?)
;

ifStatement:
 IF^ '('! expr ')'! statement (options {greedy=true;} : 'else'! statement)?
;

whileStatement:
 WHILE^ '('! expr ')'! bound invariantList statement
;

invariantList: invariant* -> ^(INVARIANT_LIST invariant*);

invariant: 
    'inv'  '(' expr ')' -> ^(REQUIRED_INV expr)
  | 'cand' '(' expr ')' -> ^(CANDIDATE_INV expr)
;

bound: ('bound' '(' NUMBER ')' )? -> ^(BOUND NUMBER?) ;

terminatedStatement:
  assigmentStmt
  | assertStmt
  | havocStmt
  | decl
  | assumeStmt
  |  -> ^(EMPTY_STMT)
;

assumeStmt:
  ASSUME^ '('! expr ')'!
;

havocStmt:
 HAVOC^ '('! ID ')'!
;

decl:
 typename ID -> ^(DECL[$ID] ID typename)
;

typename: 'int';

assigmentStmt:
 ID ASSIGNMENT^ expr
;

assertStmt:
 ASSERT^ '('! expr ')'!
;


expr:ternExp;

ternExp: lorExp (TERNARY^ lorExp ':'! lorExp)*;

lorExp: landExp (LOR^ landExp)*;

landExp: borExp (LAND^ borExp)*;

borExp: bxorExp (BOR^ bxorExp)*;

bxorExp: bandExp (BXOR^ bandExp)*;

bandExp: equalityExp (BAND^ equalityExp)*;

equalityExp:
 relExp
 (
   EQUAL^  relExp
  |NEQUAL^ relExp 
 )*
;

relExp:
 shiftExp
 (
   LT^  shiftExp 
  |LEQ^ shiftExp 
  |GT^  shiftExp 
  |GEQ^ shiftExp 
 )*
;

shiftExp:
  additionExp
  (
    LSHIFT^ additionExp
   |RSHIFT^ additionExp
  )*
;

additionExp
    :    multiplyExp
         ( ADD^      multiplyExp
          |SUBTRACT^ multiplyExp
         )*
    ;

multiplyExp
    :    unaryExp
         ( MULTIPLY^ unaryExp
          |DIVIDE^   unaryExp 
          |MOD^      unaryExp 
         )*
    ;

unaryExp:
 atomExp
 |
  ( uplus^ atomExp
   |uminus^ atomExp
   |LNOT^ atomExp
   |BNOT^ atomExp
  )
;

atomExp:
 NUMBER
 | ID
 | '('! expr ')'!
;


// start precedence list
uplus:  o=ADD      -> UPLUS[$o];
uminus: o=SUBTRACT -> UMINUS[$o];

LNOT: '!';
BNOT: '~';

MULTIPLY: '*';
DIVIDE: '/';
MOD: '%';

ADD: '+';
SUBTRACT: '-';

LSHIFT: '<<';
RSHIFT: '>>';

LT: '<';
LEQ: '<=';
GT: '>';
GEQ: '>=';

EQUAL: '==';
NEQUAL: '!=';

BXOR: '^';

BAND: '&';

BOR: '|';

LAND: '&&';

LOR: '||';

TERNARY: '?';
//end precedence list

ASSIGNMENT: '=';

IF: 'if';
WHILE: 'while';
ASSERT: 'assert';
HAVOC: 'havoc';
ASSUME: 'assume';


ID:   ('a'..'z' | 'A'..'Z') (DIGIT | 'a'..'z' | 'A'..'Z' | '_')* ;

NUMBER  : (DIGIT)+ ;
fragment DIGIT  : '0'..'9' ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WHITESPACE : ( '\t' | ' ' | '\r' | '\n'| '\u000C' )+  { $channel = HIDDEN; } ;


