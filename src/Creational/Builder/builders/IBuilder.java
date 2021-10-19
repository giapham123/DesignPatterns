package Creational.Builder.builders;

import Creational.Builder.models.Car;
import Creational.Builder.models.Engine;
import Creational.Builder.models.Wheels;

public interface IBuilder {
    BuiderIplm addEngine(Engine engine);
    BuiderIplm addWheels(Wheels wheels);
    Car builder();
}
