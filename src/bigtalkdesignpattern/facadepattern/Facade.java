package bigtalkdesignpattern.facadepattern;

public class Facade {

    private SubSystemOne subSystemOne;

    private SubSystemTwo subSystemTwo;

    private SubSystemThree subSystemThree;

    public Facade() {
        subSystemOne=new SubSystemOne();
        subSystemTwo=new SubSystemTwo();
        subSystemThree=new SubSystemThree();
    }

    public void methodAll(){
        this.subSystemOne.methodOne();
        this.subSystemTwo.methodTwo();
        this.subSystemThree.methodThree();
    }

    public void methodTwo(){
        this.subSystemTwo.methodTwo();
        this.subSystemThree.methodThree();
    }

}
