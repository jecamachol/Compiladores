grammar Simple;

program: PROGRAM ID BRACKET_OPEN
	sentence*
	sentence1*
	sentence2*
	BRACKET_CLOSE;

sentence: var_decl;
sentence1: var_assign;
sentence2: println;

var_decl: VAR ID SEMICOLON;
var_assign:ID ASSIGN NUMBER SEMICOLON;
println: PRINTLN NUMBER SEMICOLON;

PROGRAM: 'program';
VAR: 'var';
PRINTLN: 'println';

PLUS: '+';
MINUS:'-';
MULT:'*';
DIV:'/';

AND:'&&';
OR:'ǀǀ';
NOT:'!';

GT:'>';
LT:'<';
GEQ:'>=';
LEQ:'<=';
EQ:'==';
NEQ:'!=';

ASSIGN:'=';

BRACKET_OPEN:'{';
BRACKET_CLOSE:'}';

PAR_OPEN:'(';
PAR_CLOSE:')';

SEMICOLON:';';

ID:[a-zA-Z_][a-zA-Z0-9_]*;

NUMBER:[0-9];

WS:[ \t\n\r]+ -> skip;
