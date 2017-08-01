grammar NewDrawGrammar;

drawSentence: action objects '{' (methods)* '}';

action
	: 'draw'
	| 'move'
	| 'fill'
	| 'delete'
	;

objects
	: object arguments
	;

object
	: 'circle' 
	| 'square' 
	| 'rectangle' 
	| 'triangle' 
	| 'ellipse'
	| 'line'
	;

arguments
	: '(' ID SEMI* (ID)* ')'
	;
	
methods
	: NEWLINE methodName arguments SEMI
	;

methodName
	: 'dimension'
	| 'position' 
	| 'color'
	| 'left'
	| 'right'
	| 'up'
	| 'down' 
	| 'inside' 
	| 'border'
	;


//ActionKeywords

DRAW : 'draw';

MOVE : 'move';

FILL : 'fill';

DELETE : 'delete';

REMOVE : 'remove';


//ObjectKeywords

CIRCLE : 'circle';

SQUARE : 'square';

RECTANGLE : 'rectangle';

TRIANGLE : 'triangle';

ELLIPSE : 'ellipse';

//MethodKeywords

DIMENSION : 'dimension';

POSITION : 'position';

COLOR : 'color';

LEFT : 'left';

RIGHT : 'right';

UP : 'up';

DOWN : 'down';

INSIDE : 'inside';

BORDER : 'border';


//Separators

LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
SEMI : ',';
COMMA : ';';


//Identifiers

ID : [a-zA-Z0-9]+ ;


//Whitespace
NEWLINE : '\n';
WS : [ \t\r]+ -> skip;
