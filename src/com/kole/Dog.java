package com.kole;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + "is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breahe in, breathe out, repeat");
    }
}
