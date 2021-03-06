package oldpackage.decorator;

public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratorShape) {
        super(decoratorShape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratorShape);
    }

    public void setRedBorder(Shape decoratorShape) {
        System.out.println("Border Color:Red");
    }
}
