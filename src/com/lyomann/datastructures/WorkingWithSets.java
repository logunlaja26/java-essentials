package com.lyomann.datastructures;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WorkingWithSets {
    public static void main(String[] args) {
        Set<Character> charactersSet = new HashSet<>();
        charactersSet.add('A');
        charactersSet.add('A');
        charactersSet.add('B');
        charactersSet.add('C');
        charactersSet.add('D');

        Iterator<Character> iterator = charactersSet.iterator();
        while (iterator.hasNext()){
            Character character = iterator.next();
            System.out.println(character);
        }

        System.out.println();


        for (char character: charactersSet){
            System.out.println(character);
        }

    }
    //Set vs List - duplicates aren't allowed in the set data structure
    // You should never really on an ordered elements using the Set data structure, order isn't guaranteed
}
