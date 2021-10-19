package Creational.Builder.models;

public class Car {
    Engine engine;
    Wheels wheels;
    public  Car(Engine engine, Wheels wheels){
        this.engine = engine;
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString()
    {
        return engine.getEngine() + " " + wheels.getWheel();
    }
}
