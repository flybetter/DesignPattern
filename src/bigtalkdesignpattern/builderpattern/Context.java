package bigtalkdesignpattern.builderpattern;

public class Context {
    public static void main(String[] args) {
        Buider buiderA=new ConcreteBuilderA();
        Buider buiderB=new ConcreteBuilderB();

        Director.Builder(buiderA);
        buiderA.getResult();

        Director.Builder(buiderB);
        buiderB.getResult();

    }
}
