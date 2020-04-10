package oldpackage.interpreter;

public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression robert = new TermimalExpression("Robert");
        Expression john = new TermimalExpression("John");
        return new OrExpression(john, robert);
    }

    public static Expression getMarriedExpression() {
        Expression julie = new TermimalExpression("Julie");
        Expression married = new TermimalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale=InterpreterPatternDemo.getMaleExpression();
        Expression isMarriedWoman=InterpreterPatternDemo.getMarriedExpression();
        System.out.println("John is male?"+isMale.interpret("John"));
        System.out.println("Julie is a married Woman ?"+isMarriedWoman.interpret("Married Julie"));
    }
}
