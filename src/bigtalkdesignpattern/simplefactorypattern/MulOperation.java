package bigtalkdesignpattern.simplefactorypattern;

public class MulOperation extends Operation {

    @Override
    public Double getResult() {
        return this.numA*this.numB;
    }
}
