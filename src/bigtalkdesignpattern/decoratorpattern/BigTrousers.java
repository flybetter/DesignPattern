package bigtalkdesignpattern.decoratorpattern;

public class BigTrousers extends Finery {
    @Override
    public void Decorator(Person compent) {
        super.Decorator(compent);
    }

    @Override
    public void show() {
        System.out.print("大裤子");
        super.show();
    }
}
