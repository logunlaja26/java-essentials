package com.lyomann.algorithmchallenges;

public class ReverseStringAlgorithm {
    public static void main(String[] args) {
        String name = "Olayiwola";
        char[] stringToCharArray = name.toCharArray();
        int lengthOfStringToCharArray = stringToCharArray.length -1;
        char[] result = new char[name.length()];

        System.out.println(stringToCharArray.length);

        for(int counter = lengthOfStringToCharArray; counter >= 0;counter-- ){

            result[lengthOfStringToCharArray - counter] = stringToCharArray[counter];
        }

        System.out.println(result);
    }
}
