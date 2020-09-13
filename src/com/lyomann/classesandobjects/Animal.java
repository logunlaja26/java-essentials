package com.lyomann.classesandobjects;

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    // With interfaces, there are no properties allowed
    // The only thing allowed in interfaces are abstract methods (methods with no implementation)

    // Abstract Class Vs Interface
    // use Interfaces for scenarios that you might have more than one implementation
    // Use abstract classes when you have some common code that should be used across all subclasses
    // You can have a class implement more than one interface, with abstract classes, you can only extend to one class
    // Its only abstract methods inside of Interfaces, but abstract classes can contain both normal and abstract methods
}
