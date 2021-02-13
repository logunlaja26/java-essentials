package com.lyomann.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TypesOfExceptions {
    public static void main(String[] args)  {
        // Checked exceptions -  check exceptions that need to be handled at compile time
        try {
            FileInputStream inputStream = new FileInputStream("src/algoChallenges.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Uncheck exceptions - Don't have to check at compile time
        try {
            var result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException | NullPointerException e){
            System.out.println("cannot divide number by 0");
        } finally {
            System.out.println("cleaning up ....");
        }

        performDivision(1,0);
    }

    // Custom Exceptions
    static double performDivision(double a, double b){
        if (b == 0) {
            throw new MyException("cannot divide by 0");
        }
       return a / b;
    }

    static class MyException extends RuntimeException {
        public MyException(String message) {
            super(message);
        }
    }
}
