package com.lyomann;

public class ReverseStringAlgorithm {
    public static void main(String[] args) {
        String name = "Olayiwola";
        char[] stringToCharArray = name.toCharArray();
        char[] result = new char[name.length()];

        for(int counter = stringToCharArray.length -1; counter >= 0;counter-- ){

            result[stringToCharArray.length -1 - counter] = stringToCharArray[counter];
        }

        System.out.println(result);
    }
}
