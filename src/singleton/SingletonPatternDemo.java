package singleton;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        SingleObject singleObject = SingleObject.getSingleObject();
        singleObject.showMessage();

    }
}
