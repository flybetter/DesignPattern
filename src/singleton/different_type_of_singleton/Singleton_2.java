package singleton.different_type_of_singleton;

public class Singleton_2 {
    private static Singleton_2 singleton;

    public static synchronized Singleton_2 getSingleton() {
        if (singleton == null) {
            singleton = new Singleton_2();
        }
        return singleton;
    }
}
