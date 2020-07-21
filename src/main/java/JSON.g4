grammar JSON;
json
: object
| array
;

array
: '['value(','value)*']'
| '['']'
;

object
: '{' pair(',' pair)* '}'
| '{' '}'
;

pair: STRING ':' value;

// 可以是字符串，可以是数字，可以是null, 可以是对象，可以是数组
value
: STRING
| NUMBER
| object
| array
| 'true'
| 'false'
| 'null'
;
// 成除了双引号，反斜杠
STRING: '"'(ESC|~["\\])*'"';

fragment ESC: '\\' (["\\/nfmrt]|UNICODE);

fragment UNICODE: 'u' HEX HEX HEX HEX;

fragment HEX: [0-9a-fA-F];

NUMBER
: '-'? INT '.' INT EXP?
| '-'? INT EXP
| '-'? INT
;

fragment EXP: [Ee] [+\-]? INT;
fragment INT: '0' | [1-9][0-9]*;
WS : [ \t\n\r]+ -> skip;



