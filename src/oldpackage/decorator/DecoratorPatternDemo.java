package oldpackage.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();

    }
}
