package com.lyomann.classesandobjects;

public interface AnimalInterface {
    void makeSound();
    String getName();




    // With interfaces, there are no properties allowed
    // The only thing allowed in interfaces are abstract methods (methods with no implementation)

    // Abstract Class Vs Interface
    // use Interfaces for scenarios that you might have more than one implementation
    // Use abstract classes when you have some common code that should be used across all subclasses
    // You can have a class implement more than one interface, with abstract classes, you can only extend to one class
    // Its only abstract methods inside of Interfaces, but abstract classes can contain both normal and abstract methods
}
