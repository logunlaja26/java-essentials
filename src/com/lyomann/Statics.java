package com.lyomann;

import java.util.ArrayList;
import java.util.List;

public class Statics {
    public static final String BRAND;
    static List list;

    static {
        BRAND = "AMIGOSCODE";
        list = new ArrayList();
        list.add("");
    }


    public static void main(String[] args) {
      Person ly = new Person("Ly");
      Person bob = new Person("bob");
      System.out.println(ly.name);
      System.out.println(bob.name);
      System.out.println(Person.createdPeople);

    }

    static class Person{
        static int createdPeople = 0;
        String name;
        Person(String name){
            this.name = name;
            createdPeople++;
        }
    }
    // Static variables are shared amongst all objects of the same type
    // Static defined on a method,field,or variable means that it belongs to the class not to the instances of the class object
}
