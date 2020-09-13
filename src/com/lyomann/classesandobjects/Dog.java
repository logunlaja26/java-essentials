package com.lyomann.classesandobjects;

public class Dog implements AnimalInterface{
    private String breed;
    private String name;
    public Dog(String name,String breed) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF WOOF");
    }

    @Override
    public String getName() {
        return this.name;
    }

    //Super means the variable(name) will be passed inside of the super class, no need for this.name
    //Inheritance- children class inherit properties from the parent class
    //Abstraction - is the process of hiding certain details and showing certain info to users - abstract classes , Interfaces
    //abstract method is a method with no implementation
    //extends - abstract classes
    //Implements - interfaces

    // With interfaces, there are no properties allowed
    // The only thing allowed in interfaces are abstract methods (methods with no implementation)

    // Abstract Class Vs Interface
    // use Interfaces for scenarios that you might have more than one implementation
    // Use abstract classes when you have some common code that should be used across all subclasses
    // You can have a class implement more than one interface, with abstract classes, you can only extend to one class
    // Its only abstract methods inside of Interfaces, but abstract classes can contain both normal and abstract methods
}
