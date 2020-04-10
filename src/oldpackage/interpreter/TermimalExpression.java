package oldpackage.interpreter;

public class TermimalExpression implements Expression {

    protected String data;


    public TermimalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }
}
