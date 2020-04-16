package bigtalkdesignpattern.factorypattern;

public class UnderGraduate extends LeiFeng {
    @Override
    public void sweep() {
        System.out.println("大学生拖地");
    }

    @Override
    public void wash() {
        System.out.println("大学生洗衣服");
    }
}
