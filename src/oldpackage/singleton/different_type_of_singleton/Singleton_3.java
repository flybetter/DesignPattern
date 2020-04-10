package oldpackage.singleton.different_type_of_singleton;

public class Singleton_3 {
    private static Singleton_3 singleton = new Singleton_3();

    private Singleton_3() {
    }

    public Singleton_3 getSingleton() {
        return singleton;
    }
}
