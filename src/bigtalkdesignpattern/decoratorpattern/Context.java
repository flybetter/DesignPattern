package bigtalkdesignpattern.decoratorpattern;

public class Context {
    public static void main(String[] args) {

        ConcreteComponent c=new ConcreteComponent();

        ConcreteDecoratorA d1=new ConcreteDecoratorA();

        ConcreteDecoratorB d2=new ConcreteDecoratorB();

        d1.setComponent(c);

        d2.setComponent(d1);

        d2.operation();
//      核心的实现，就是在原来的实现的基础上，又实现了新的算法，不影响原来的功能。

    }
}
