package Creational.AbstractFactory.Abstract;


import Creational.AbstractFactory.Bird;
import Creational.AbstractFactory.Duck;
import Creational.AbstractFactory.IAnimal;

import java.util.Random;

public class twoLegsAbstract extends IAbstractAnimal {

    @Override
    public IAnimal createAnimal(){
        Random random = new Random();
        int type = random.nextInt(2)+1;
        if (type == 1)
        {
            return new Duck();
        }
        else
        {
            return new Bird();
        }
    }
}
