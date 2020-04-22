package bigtalkdesignpattern.builderpattern;

import bigtalkdesignpattern.decoratorpattern.Person;

public class ConcreteBuilderB extends Buider {

    private Product product;

    public ConcreteBuilderB() {
        product=new Product();
    }

    @Override
    public void builderA() {
        product.add("长胳膊");
    }

    @Override
    public void builderB() {
        product.add("长腿");
    }

    @Override
    public void getResult() {
        product.showBodys();
    }
}
