package thinkinjava;

class Cup {

    public Cup(int market) {
        System.out.println("Cup(" + market + ")");
    }

    public void f(int market) {
        System.out.println("f(" + market + ")");
    }
}

class Cups{

    static Cup cup1;

    static Cup cup2;

    {
        cup1=new Cup(1);
        cup2=new Cup(2);
    }

    public Cups() {
        System.out.println("Cups()");
    }

}

public class ExplicitStatic{
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(1);
    }

    static Cups x=new Cups();
    static Cups y=new Cups();
}


