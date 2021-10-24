package Behavioral.Observer.Base;

public abstract class Observer {
    public Subject subject;
    public abstract void notify(Subject subject);
}
