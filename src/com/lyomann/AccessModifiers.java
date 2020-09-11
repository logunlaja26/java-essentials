package com.lyomann;

public class AccessModifiers {
    public static void main(String[] args){
        Lens lens = new Lens();
    }

    public static class Lens {}
}

//private - acessmodifier that is class protected. method & variable can only be used within the class it was created
//public - acessmodifier that allows variable & methods to be used anywhere
//static - accessmodifier that is package protected. Methods can only used within classes in the same package