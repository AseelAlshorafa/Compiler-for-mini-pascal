package AST;


public class RealType extends Type {
    
    public RealType(){
        super("REAL");
    }
    
    @Override
    public String getCname(){
        return "double";
    }
}
