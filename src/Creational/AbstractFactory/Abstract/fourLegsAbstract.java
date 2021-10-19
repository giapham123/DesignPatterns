package Creational.AbstractFactory.Abstract;


import Creational.AbstractFactory.Cat;
import Creational.AbstractFactory.Dog;
import Creational.AbstractFactory.IAnimal;

import java.util.Random;

public class fourLegsAbstract extends IAbstractAnimal  {

    @Override
    public IAnimal createAnimal(){
        Random random = new Random();
        int type = random.nextInt(2)+1;
        if (type == 1)
        {
            return new Dog();
        }
        else
        {
            return new Cat();
        }
    }
}
