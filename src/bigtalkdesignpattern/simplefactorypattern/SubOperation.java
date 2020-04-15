package bigtalkdesignpattern.simplefactorypattern;

public class SubOperation extends Operation {
    @Override
    public Double getResult() {
        if (numB != 0) {
            return numA/numB;
        }else {
            System.out.println("numB is zero, it can't afford");
            return null;
        }
    }
}
