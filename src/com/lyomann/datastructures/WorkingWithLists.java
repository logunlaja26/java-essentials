package com.lyomann.datastructures;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List numbers = new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //removing an element from a list
        numbers.remove(1);

        //adding an element to a list
        numbers.add(0,-1);

        //boolean method to check if list contains giving element
        System.out.println(numbers.contains(80));

        //boolean method to check if list is empty
        System.out.println(numbers.isEmpty());

        //gets the size of the list
        System.out.println(numbers.size());

        //numbers.clear() removes all of the elements in the list

        System.out.println(numbers);

        //looping through a list object
        //We use Object data type in the loop because no generic data type was binded to the list of numbers above
        for(Object number: numbers){
            System.out.println(number);
        }

        System.out.println();
        // functional programming way of for loop
        numbers.forEach(System.out::println);

    }
    // Lists - flexible sized data structure in which the size can be expanded
    // Lists (Not Fixed Size) vs Arrays (Fixed Size)
}
