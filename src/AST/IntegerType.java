package AST;


public class IntegerType extends Type {
    
    public IntegerType(){
        super("INTEGER");
    }
    
    @Override
    public String getCname(){
        return "long int";
    }
}
