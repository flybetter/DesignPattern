package iterator;

public class IteratorPatternDemo {

    public static void main(String[] args) {

        NameContainer nameContainer = new NameContainer();
        for (Iterator iterator = nameContainer.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            System.out.println("Name:" + name);
        }
    }

}
