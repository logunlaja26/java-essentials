package com.lyomann.classesandobjects;

import static com.lyomann.classesandobjects.IphoneModelEnum.IPHONE_11;
import static com.lyomann.classesandobjects.IphoneModelEnum.IPHONE_X;

public class Classes {
    public static void main(String[] args) {
        Iphone iphone11 = new Iphone(IPHONE_X,
                -11.0);


//        System.out.println(iphone11.getModel());
//        System.out.println(iphone11.getPrice());
//        System.out.println(iphone11.isWaterResistant());

        System.out.println(iphone11);
    }

    //Enum - is a class which allows you to represent a group of constants
}
