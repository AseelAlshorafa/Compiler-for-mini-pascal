package AST;


abstract public class NumberExpr extends Expr {

    
    @Override
    abstract public void genC(PW pw, boolean putParenthesis);

    /**
     *
     * @return
     */
    @Override
    abstract public Type getType();
}
