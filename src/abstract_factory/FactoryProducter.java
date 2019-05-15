package abstract_factory;

public class FactoryProducter {

    public static AbstractFactory getFactory(String type) {
        if (type.equalsIgnoreCase("color")) {
            return new ColorFactory();
        } else if (type.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
