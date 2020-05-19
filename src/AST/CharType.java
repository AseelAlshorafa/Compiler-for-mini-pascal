package AST;


public class CharType extends Type {

    public CharType() {
        super("CHAR");
    }

    @Override
    public String getCname() {
        return "char";
    }
}
