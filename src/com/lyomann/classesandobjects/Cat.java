package com.lyomann.classesandobjects;

public class Cat implements AnimalInterface{

    private String name;
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
