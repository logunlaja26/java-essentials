package com.lyomann;

import java.awt.*;

public class FinalKeyword {
    public static void main(String[] args){
        final var name = "Anna";
        final var number = 0;
        final Point point = new Point(0,0);
        point.x = 100;
        point.y = 100;

        System.out.println(name);


        System.out.println(point);
    }
}
