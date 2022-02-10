
%{
	#include <stdio.h>

%}

%token Plus Minus  Number Equal Mult Div Power PR PL
%start input
%left Plus Minus
%left Mult Div
%right Power

%%
input : 
		| input line {printf("Resultado %d",$2);}
		;
line : Equal   
		| Exp Equal
		; 
Exp : Number 
		| Exp Plus Exp {$$ = $1 + $3;} 
		| Exp Minus Exp {$$ = $1 - $3;}
		| Exp Mult Exp {$$ = $1 * $3;
						
							}
		| Exp Div Exp {
						if($3 == 0){
							printf("no se puede dividir en cero\n");
							}
						else
							$$ = $1 / $3;}
		| Exp Power Exp {
						int x = $1;
						for(int i = 1;i<$3;i++)
							x *=$1;
						$$ = x;
						}

%%
void yyerror(char *s){
	printf ("ocurrio un error %s",s);
}
int yywrap(){
	return 1;
}
int main(void){
	yyparse();
}




