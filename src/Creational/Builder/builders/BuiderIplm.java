package Creational.Builder.builders;


import Creational.Builder.models.Car;
import Creational.Builder.models.Engine;
import Creational.Builder.models.Wheels;

public class BuiderIplm implements IBuilder{

    Engine engine;
    Wheels wheels;

    @Override
    public BuiderIplm addEngine(Engine engine){
        this.engine = engine;
        return this;
    }
    @Override
    public BuiderIplm addWheels(Wheels wheels){
        this.wheels = wheels;
        return this;
    }
    @Override
    public Car builder(){
        return new Car(engine, wheels);
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
}
