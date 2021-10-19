package Creational.FactoryMethod;

import Creational.FactoryMethod.Factory.BasicAnimal;
import Creational.FactoryMethod.Factory.IAnimalFactofy;
import Creational.FactoryMethod.Factory.RandomAnimal;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        BasicAnimal baic= new BasicAnimal();
        RandomAnimal random = new RandomAnimal();

        System.out.println(baic.createAnimal().getName());
        System.out.println(random.createAnimal().getName());
        System.out.println(random.createAnimal().getName());
    }
}
