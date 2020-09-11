package com.lyomann.classesandobjects;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone11 = new Iphone("11",900.00,false);


        iphone11.setPrice(500.00);
        iphone11.setWaterResistant(true);

        System.out.println(iphone11.getModel());
        System.out.println(iphone11.getPrice());
        System.out.println(iphone11.isWaterResistant());
    }
}
