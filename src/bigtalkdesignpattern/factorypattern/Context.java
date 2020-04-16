package bigtalkdesignpattern.factorypattern;

public class Context {
    public static void main(String[] args) {
        IFactory iFactory=new UnderGraduateFactory();
        LeiFeng leiFeng=iFactory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.wash();

    }
}
