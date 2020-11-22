package com.lyomann.datastructures;

import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        String strings[] = new String[4];
        strings[0] = "hey";
        strings[1] = "There";
        strings[2] = "Mrs";
        System.out.println(Arrays.toString(strings));



        int[] numbers = {1,20,500,4};
        //numbers[4] = 700;
        System.out.println(Arrays.toString(numbers));

        // Enhanced for loop - how to print each element in the array line by line
        for(int number: numbers){
            System.out.println(number);
        }

        // Traditional for loop - how to print each element in the array line by line
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }

    // Array is a data structure that allows you to store more than one value
    // Arrays have a fixed size elements that can't be changed later
    // Array sizes have to be defined when instantiating an array object
    // ArrayList can change size at runtime as needed.
    // Like an array, an ArrayList is an ordered sequence that allows duplicates
}
