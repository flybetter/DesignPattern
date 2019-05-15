package simple_factory;

public class FactoryProducer {
    public static Color getColor(String color) {
        if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("red")) {
            return new Red();
        }
        return null;
    }
}
