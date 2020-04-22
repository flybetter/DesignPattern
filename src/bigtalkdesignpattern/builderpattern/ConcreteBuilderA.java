package bigtalkdesignpattern.builderpattern;

public class ConcreteBuilderA extends Buider {

    private Product product;

    public ConcreteBuilderA() {
        this.product = new Product();
    }

    @Override
    public void builderA() {
        product.add("短胳膊");
    }

    @Override
    public void builderB() {
        product.add("短腿");
    }

    @Override
    public void getResult() {
        product.showBodys();
    }
}
