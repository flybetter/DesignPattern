package bigtalkdesignpattern.factorypattern;

public class VoluteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
