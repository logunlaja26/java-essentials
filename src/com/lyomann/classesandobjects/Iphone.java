package com.lyomann.classesandobjects;

public class Iphone {
    private IphoneModelEnum model;
    private double price;
    private boolean isWaterResistant;



    public Iphone(IphoneModelEnum model,
                  double price,
                  boolean isWaterResistant){
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public Iphone(IphoneModelEnum model){
        this(model,0.0,false);
        this.model = model;
    }

    public Iphone(IphoneModelEnum model,double price){
        this(model,price,true);
        this.model = model;
        this.price = price;
    }



    public IphoneModelEnum getModel() {
        return model;
    }

    public void setModel(IphoneModelEnum model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }

    // You can always have more than one constructor
    // Encapsulation - The data of your classes should be hiding from the outside , and only should be accessible through
    // its on methods.
    // Inheritance - Is the process in which an object acquires all of the properties & behaviors of a parent object

}
