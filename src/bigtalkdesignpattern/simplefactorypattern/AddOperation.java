package bigtalkdesignpattern.simplefactorypattern;

public class AddOperation extends Operation {
    @Override
    public Double getResult() {
        return this.numA+this.numB;
    }
}
