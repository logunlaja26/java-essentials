package com.lyomann.algorithmchallenges;

public class CapitalizeFirstLetterInString {
    public static void main(String[] args) {
        String sentence = "happy saturday to you all";
        StringBuffer res = new StringBuffer();

        String[] strArr = sentence.split(" ");
        for(String str : strArr){
            char[] stringArray = str.trim().toCharArray();
            stringArray[0] = Character.toUpperCase(stringArray[0]);
            str = new String(stringArray);

            res.append(str).append(" ");
        }

        System.out.println("Result: " + res.toString().trim());
    }
}
