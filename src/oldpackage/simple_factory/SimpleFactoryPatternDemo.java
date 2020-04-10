package oldpackage.simple_factory;

public class SimpleFactoryPatternDemo {
    public static void main(String[] args) {
        Color color = FactoryProducer.getColor("blue");
        color.draw();
    }
}
