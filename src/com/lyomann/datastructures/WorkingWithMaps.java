package com.lyomann.datastructures;

import java.util.HashMap;
import java.util.Map;

public class WorkingWithMaps {
    public static void main(String[] args) {
        Map<Integer , String> map = new HashMap<>();
        map.put(1,"Hanna");
        map.put(2,"Jamil");
        map.put(3,"Alice");
        map.put(3,"Jake");
        map.put(3,"Ly");
        System.out.println(map);


        // To get the value of a specific key
        System.out.println(map.get(3));

        // To get all of the key
        System.out.println();
        System.out.println(map.keySet());

        // loop through a map to get values of keys
        System.out.println();
        for(int key : map.keySet()){
            System.out.println(map.get(key));
        }

        //loop through a map to get the key and values in a map
        System.out.println();
        for(int key : map.keySet()){
            System.out.println(key  + " " + map.get(key));
        }

        //Utilizing maps to get the key and values in a map
        System.out.println();
        map.forEach((k,v) -> {
            System.out.println(k + "-" + v);
        });

    }
        //Map - interface that allows to store key value pairs {name: "name" , age : 2}
        //No duplicate values allowed in Maps
}
