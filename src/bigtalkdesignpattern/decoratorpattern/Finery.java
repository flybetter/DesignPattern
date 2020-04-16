package bigtalkdesignpattern.decoratorpattern;

public class Finery extends Person  {

    private Person compent;

    public void Decorator(Person compent){
        this.compent=compent;
    }

    public void show(){
        this.compent.show();
    }
}
