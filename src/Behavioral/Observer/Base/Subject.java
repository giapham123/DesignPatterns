package Behavioral.Observer.Base;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers = new ArrayList<>();
    public  void attachObserver(Observer observer){
        observers.add(observer);
    }
    public  void detachObserver(Observer observer){
        observers.add(observer);
    }
    public  void NotifyObserver(Subject subject){
       for(Observer observer:observers){
           observer.notify(subject);
       }
    }
}
