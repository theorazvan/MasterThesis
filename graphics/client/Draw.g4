grammar Draw;


  //operational
MOVE : 'move';
DRAW : 'draw';
CHANGE : 'change';
ERASE : 'erase';
FILL : 'fill';
TRANSFORM : 'transform';
ADD : 'add';
REMOVE : 'remove';
DELETE : 'delete';
CREATE : 'create';

  //shape
CIRCLE : 'circle';
SQUARE : 'square';
RECTANGLE : 'rectangle';
TRIANGLE : 'triangle';
ELLIPSE : 'ellipse';
SHAPE : 'shape';
BOX : 'box';

//shapes
CIRCLES : 'circles';
SQUARES : 'squares';
RECTANGLES : 'rectangles';
TRIANGLES : 'triangles';
ELLIPSES : 'ellipses';
SHAPES : 'shapes';
BOXES : 'boxes';

  //color
RED : 'red';
BLUE : 'blue';
GREEN : 'green';
BLACK : 'black';
PURPLE : 'purple';
YELLOW : 'yellow';
ORANGE : 'orange';
PINK : 'pink';
WHITE : 'white';
GREY : 'grey';

  //numbers
ZERO : 'zero';
ONE : 'one';
TWO : 'two';
THREE : 'three';
FOUR : 'four';
FIVE : 'five';
SIX : 'six';
SEVEN : 'seven';
EIGHT : 'eight';
NINE : 'nine';
NUMBER : [0-9]+ ;

 //length
HEIGHT : 'height';
WIDTH : 'width';
RADIUS : 'radius';
DIAMETER : 'diameter';

 //position
OVER : 'over';
UNDER : 'under';
ABOVE : 'above';
BELOW : 'below';
TOP : 'top';
BOTTOM : 'bottom';
LEFT : 'left';
RIGHT : 'right';
UP : 'up';
DOWN : 'down';
FORWARD : 'forward';
BACKWARD : 'backward';

  //prefix
A : 'a';
AT : 'at';
AN : 'an';
AND : 'and';
ALL : 'all';
ANY : 'any';
EACH : 'each';
THE : 'the';
WITH : 'with';
ON : 'on';


//Parser Rules

drawSentence: action object argument? ;

action: MOVE | DRAW | CHANGE | ERASE | FILL | TRANSFORM | ADD | REMOVE | DELETE | CREATE ; 

object : prefix? property? property? allShape;

argument: prefix? state numbers argument? ;

prefix: A | AT | AN | AND | ALL | ANY | EACH | THE | WITH | ON ;

shape: CIRCLE | SQUARE | RECTANGLE | TRIANGLE | ELLIPSE | SHAPE | BOX ;

shapes: CIRCLES | SQUARES | RECTANGLES | TRIANGLES | ELLIPSES | SHAPES | BOXES ;

allShape: shape | shapes ;

property: color | numbers ;

color: RED | BLUE | GREEN | BLACK | PURPLE | YELLOW | ORANGE | PINK | WHITE | GREY ;

number: ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE ;

numbers: number | NUMBER ;

position: OVER | UNDER | ABOVE | BELOW | TOP | BOTTOM | LEFT | RIGHT | UP | DOWN | FORWARD | BACKWARD ;

state : position | length ;

length : HEIGHT | WIDTH | RADIUS | DIAMETER ;

WHITESPACE : [\t\n\r]+ -> skip ;
