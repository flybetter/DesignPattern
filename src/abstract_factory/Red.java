package abstract_factory;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println(" Red inside: fill method");
    }
}
