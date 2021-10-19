package Creational.AbstractFactory.Abstract;

import Creational.AbstractFactory.IAnimal;

public abstract class IAbstractAnimal implements IAnimalFactory{
    public abstract IAnimal createAnimal();
}
