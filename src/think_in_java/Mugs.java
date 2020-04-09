package think_in_java;


class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

public class Mugs {
    Mug c5=new Mug(5);
    static Mug c1;
    static Mug c2;
    Mug c3=new Mug(3);
    static {
        c1 = new Mug(1);
        c2 = new Mug(2);
        System.out.println("c1 & c2 initialized");
    }

    {

        Mug c6=new Mug(6);
        System.out.println("demo");
    }

    Mug c4=new Mug(4);

    Mugs() {
        System.out.println("Mugs()");
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");
        Mugs x = new Mugs();
    }
} ///:~