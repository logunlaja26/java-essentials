package com.lyomann;

public class JavaSwitchStatement {
    public static void main(String[] args) {
        int age;
        age = 4;
        switch (age) {
            case 1:
                System.out.println("This is not the age ");
                break;
            case 2:
                System.out.println("You can crawl");
                break;
            case 3:
                System.out.println("This is the age");
                break;
            default:
                System.out.println("I dont know how old you are");
                break;

        }
    }
    // Switch statements prevent us from us writing multiple if statements


}
