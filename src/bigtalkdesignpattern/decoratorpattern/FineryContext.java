package bigtalkdesignpattern.decoratorpattern;

public class FineryContext {
    public static void main(String[] args) {
        Person person = new Person("小菜");

        TShirts tShirts = new TShirts();

        BigTrousers bigTrousers = new BigTrousers();
        tShirts.Decorator(person);
        bigTrousers.Decorator(tShirts);

        bigTrousers.show();

//      装饰模式是为了已有功能动态添加更多的功能的一种方式
    }
}
