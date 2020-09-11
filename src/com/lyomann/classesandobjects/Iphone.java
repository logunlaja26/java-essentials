package com.lyomann.classesandobjects;

public class Iphone {
    private String model;
    private double price;
    private boolean isWaterResistant;

    public Iphone(){
    }

    public Iphone(String model,
                  double price,
                  boolean isWaterResistant){
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }

    public Iphone(String model){
        this.model = model;
    }



    public String getModel() {
        return model;
    }

    public void setModel(String model) {
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

    // You can always have more than one constructor
}
