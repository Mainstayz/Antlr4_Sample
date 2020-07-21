grammar PropertyFile;
// 这种写法不好，与java绑定了
// 自定义语法解析器
file: prop+;

prop: ID '=' STRING '\n';


ID : [a-zA-Z]+;

STRING : '"'.*?'"';