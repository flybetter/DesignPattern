package bigtalkdesignpattern.simplefactorypattern;

public class DivOperation extends Operation {
    @Override
    public Double getResult() {
        return this.numA-this.numB;
    }
}
