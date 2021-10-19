package Creational.FactoryMethod.Factory;

import Creational.FactoryMethod.Cat;
import Creational.FactoryMethod.Dog;
import Creational.FactoryMethod.Duck;
import Creational.FactoryMethod.IAnimal;

import java.util.Random;

public class RandomAnimal implements  IAnimalFactofy {
    @Override
    public IAnimal createAnimal() {
        Random ramdom = new Random();
        int type = ramdom.nextInt(2) +1;
        if (type == 0) {
            return new Dog();
        } else if (type == 1) {
            return new Cat();
        }else  {
            return new Duck();
        }
    }
}
