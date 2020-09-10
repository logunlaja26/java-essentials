package com.lyomann;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("before changing a");
        System.out.println("a = " + a + " - b = " + b);

        a = 100;
        System.out.println("After changing a");
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person("alex");
        Person mariah = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariah.name);

        alex.name = "Mariam";

        System.out.println("After changing alex");
        System.out.println(alex.name + " " + mariah.name);
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}
