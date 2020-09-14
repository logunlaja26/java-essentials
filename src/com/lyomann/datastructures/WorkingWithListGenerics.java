package com.lyomann.datastructures;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithListGenerics {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        //numbers.add("hello");
        //numbers.add(new Point(10,10));
        //numbers.add('A');

        //adding an element to a list
        numbers.add(0,-1);

        System.out.println(numbers);

        //We use int data type in the loop because its was bound to the generic type of the list of numbers above
        for(int number : numbers){
            System.out.println(number);
        }

    }
    //Generics enforce the data type that your data structures support
    //You can not have primitives in the generic constraints, it has to be the object data type (i.e Integer not int)
}
