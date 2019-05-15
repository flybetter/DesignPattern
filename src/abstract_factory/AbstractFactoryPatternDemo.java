package abstract_factory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory colorFactory = FactoryProducter.getFactory("color");
        Color color = colorFactory.getColor("blue");
        color.fill();


        AbstractFactory shapeFactory = FactoryProducter.getFactory("shape");
        Shape shape = shapeFactory.getShape("rectangle");
        shape.draw();
    }
}
