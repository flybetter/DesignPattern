package bigtalkdesignpattern.factorypattern;

public class UnderGraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new UnderGraduate();
    }
}
