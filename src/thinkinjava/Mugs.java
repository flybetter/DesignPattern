package thinkinjava;

public class Mugs {



     Mug mug1;
     Mug mug2;
     static Mug mug3;
     static Mug mug4;

    {
        mug1=new Mug(1);
        mug2=new Mug(2);
        mug3=new Mug(3);
        mug4=new Mug(4);
    }

    public static void main(String[] args) {
        Mugs mugs=new Mugs();
        Mugs mugs2=new Mugs();
    }
}

class Mug{

    public Mug(int market) {
        System.out.println("Mug("+market+")");
    }

    public void f(int market){
        System.out.println("f("+market+")");
    }
}
