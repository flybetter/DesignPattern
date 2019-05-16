package singleton.different_type_of_singleton;

public class Singleton_4 {
    private volatile static Singleton_4 instance;

    private Singleton_4() {
    }

    public static Singleton_4 getInstance() {
        if (instance == null) {
            synchronized (Singleton_4.class) {
                instance = new Singleton_4();
            }
        }
        return instance;
    }
}
