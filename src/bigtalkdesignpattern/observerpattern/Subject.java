package bigtalkdesignpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    private List<Observer> observers=new ArrayList<>();

    public  void add(Observer observer ){
        observers.add(observer);
    }


    public void detach(Observer observer ){
        observers.remove(observer);

    }

}
