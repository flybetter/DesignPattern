package bigtalkdesignpattern.decoratorpattern;

public class TShirts extends Finery {

    @Override
    public void Decorator(Person compent) {
        super.Decorator(compent);
    }

    @Override
    public void show() {
        System.out.print("T shirts");
        super.show();
    }
}
