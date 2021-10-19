package Creational.AbstractFactory;

import Creational.AbstractFactory.Abstract.IAnimalFactory;
import Creational.AbstractFactory.Abstract.fourLegsAbstract;
import Creational.AbstractFactory.Abstract.twoLegsAbstract;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        IAnimalFactory iAnimalFactory;

        Random random = new Random();
        int type = random.nextInt(2)+1;
        if (type == 1)
        {
            iAnimalFactory = new fourLegsAbstract();
        }
        else
        {
            iAnimalFactory = new twoLegsAbstract();
        }
        System.out.println(iAnimalFactory.createAnimal().getName());
        System.out.println(iAnimalFactory.createAnimal().getName());
        System.out.println(iAnimalFactory.createAnimal().getName());
        System.out.println(iAnimalFactory.createAnimal().getName());
    }
}
