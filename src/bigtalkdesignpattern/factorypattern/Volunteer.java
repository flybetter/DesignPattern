package bigtalkdesignpattern.factorypattern;

public class Volunteer extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("志愿者拖地");
    }

    @Override
    public void wash() {
        System.out.println("志愿者洗衣服");
    }
}
