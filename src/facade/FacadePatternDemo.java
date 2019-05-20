package facade;

public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMarket shapeMarket = new ShapeMarket();
        shapeMarket.drawCircle();
        shapeMarket.drawRectangle();
        shapeMarket.drawSquare();


    }
}
