package com.lyomann.dealingwithmoney;

import java.math.BigDecimal;

public class DataTypeForMoney {
    public static void main(String[] args) {
        /*
        Double numberOne = 0.02;
        Double numberTwo = 0.03;
        Double result = numberTwo - numberOne;
        System.out.println(result);
        */

        BigDecimal numberOne = new BigDecimal("0.02");
        BigDecimal numberTwo = new BigDecimal("0.03");
        BigDecimal result = numberTwo.subtract(numberOne);
        System.out.println(result);

        System.out.println(numberOne.compareTo(numberTwo));


    }
    // Should make use of Double primitive or object to represent money in java
    // The big decimal is the appropriate data type to represent money
    // Big decimal calculation gives you the precise arithemetic calculation
}
