package flyweight;

public class FlyweightPatternDemo {
    private static final String colors[] =
            {"Red", "Green", "Blue", "White", "Black"};

    public static void main(String[] args) {

        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setRadius((int) (Math.random() * 100));
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }


    private static String getRandomColor() {
        int index = (int) (Math.random() * colors.length);
        return colors[index];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }


    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }


}




