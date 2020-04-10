package oldpackage.proxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("purple.img");

        image.display();

        image.display();
    }
}
