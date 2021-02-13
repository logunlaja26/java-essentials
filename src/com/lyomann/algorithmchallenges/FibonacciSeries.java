package com.lyomann.algorithmchallenges;

public class FibonacciSeries {
    public static void main(String[] args) {

        int maxNumber = 10;
        int previousNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci Series of " + maxNumber + " numbers:");
        for(int i = 1; i <= maxNumber; i++){
            System.out.println(previousNumber+" ");

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }

    }
}


/*
*In Fibonacci series, next number is the sum of previous two numbers.
*The first two numbers of Fibonacci series are 0 and 1.
*
*
*The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
* */