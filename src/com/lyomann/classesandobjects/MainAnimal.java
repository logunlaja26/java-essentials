package com.lyomann.classesandobjects;

public class MainAnimal {
    public static void main(String[] args) {
        //Animal animal = new Animal("bobby");
        Dog dog = new Dog("Bruno","German Shepard");
        AnimalInterface cat = new Cat("Rosie");
        dog.makeSound();
        cat.makeSound();
        System.out.println(dog.getName() + " is a " + dog.getBreed());

        SuperMath superMath = new SuperMath();
        System.out.println(superMath.add(1,2));
        System.out.println(superMath.add(1,2,5));
    }
}
