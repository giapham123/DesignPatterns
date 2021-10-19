package Creational.Builder;

import Creational.Builder.builders.BuiderIplm;
import Creational.Builder.models.Car;
import Creational.Builder.models.Engine;
import Creational.Builder.models.Wheels;

public class main {
    public static void main(String[] args) {
        Car car = new BuiderIplm().addEngine(new Engine("engine")).addWheels(new Wheels("wheel")).builder();
        System.out.print(car.toString());

    }
}
