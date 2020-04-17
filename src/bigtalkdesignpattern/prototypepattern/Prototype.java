package bigtalkdesignpattern.prototypepattern;

public abstract class Prototype {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Prototype clone();
}
