grammar PropertyFile;
@member {
    void startFile(){}
    void finishFile(){}
    void defineProperty(Token name,Token value){}
}
file: {startFile();} prop+ {finishFile();};

prop: ID '=' STRING '\n' {defineProperty($ID,%STROMH);};


ID : [a-zA-Z]+;

STRING : '"'.*?'"';