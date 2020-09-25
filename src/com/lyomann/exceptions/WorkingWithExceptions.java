package com.lyomann.exceptions;

public class WorkingWithExceptions {
    public static void main(String[] args) {
        String brand = null;
        try {
            System.out.println(brand.length());
        } catch (NullPointerException e){
            System.out.println("brand was null " + e);
        }


    }
}
