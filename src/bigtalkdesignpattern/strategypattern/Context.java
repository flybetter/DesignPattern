package bigtalkdesignpattern.strategypattern;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }


    public static void main(String[] args) {

        Context context=new Context(new ConcreteStrategyA());

        context.ContextInterface();


        Context context1=new Context(new ConcreteStrategyB());

        context.ContextInterface();


        Context context2=new Context(new ConcreteStrategyC());

        context.ContextInterface();
//      策略模式，就是把算法区分开来，和工厂模式公用，把静态工厂变成类

    }
}
