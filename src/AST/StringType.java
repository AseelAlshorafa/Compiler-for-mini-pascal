package AST;


public class StringType extends Type {
    
    public StringType(){
        super("STRING");
    }
    
    @Override
    public String getCname(){
        return "char";
    }
}
