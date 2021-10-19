package Creational.FactoryMethod.Factory;

import Creational.FactoryMethod.Cat;
import Creational.FactoryMethod.Dog;
import Creational.FactoryMethod.Duck;
import Creational.FactoryMethod.IAnimal;

import java.util.Random;

public class BasicAnimal implements  IAnimalFactofy {
    @Override
    public IAnimal createAnimal() {
        int index = 0;
        if(index == 0){
            index ++;
            return new Dog();
        }else if (index == 0){
            index ++;
            return new Duck();
        }else{
            index ++;
            return new Cat();
        }
    }
}
