package load_class;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class LoadClass_example {

    public static void main(String[] args) {
        Person person = new Person();
        Class clazz = person.getClass();

        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.toString());
        }
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            System.out.println(field.toString());

        }

        Constructor[] constructors = clazz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toString());

        }

    }

}
