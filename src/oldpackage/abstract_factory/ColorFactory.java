package oldpackage.abstract_factory;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("blue")) {
            return new Blue();
        } else if (color.equalsIgnoreCase("green")) {
            return new Green();

        } else if (color.equalsIgnoreCase("red")) {
            return new Red();

        } else {
            return null;
        }
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
