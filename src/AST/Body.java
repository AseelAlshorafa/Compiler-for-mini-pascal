package AST;

public class Body {

    private final DeclarationPart dclPart;
    private final CompositeStatement compositeStatement;

    public Body(DeclarationPart dclPart, CompositeStatement compositeStatement) {
        this.dclPart = dclPart;
        this.compositeStatement = compositeStatement;
    }

    public void genC(PW pw) {
        pw.out.println("#include <stdio.h>");
        pw.out.println("#include <string.h>");
        pw.out.println();
        pw.println("void main() {");
        pw.add();

        dclPart.genC(pw);
        pw.out.println("");

        compositeStatement.genC(pw);
        pw.sub();
        pw.out.println("}");
        System.out.println("The File WAS compiled SUCCESSFULLY to C  AND STORED IN TESTS/OUTPUT.TXT FILE  ");
    }
}
