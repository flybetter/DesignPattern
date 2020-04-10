package oldpackage.singleton.different_type_of_singleton;

public class Singleton_1 {
    //    lazy,but not safe
    private static Singleton_1 singleton;

    public static Singleton_1 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton_1();
        }
        return singleton;
    }
}
