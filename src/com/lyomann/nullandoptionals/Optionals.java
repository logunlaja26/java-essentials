package com.lyomann.nullandoptionals;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        String brand = null;
        String theBrand = Optional.ofNullable(brand)
                .map(String::toUpperCase)
                .orElseGet(() -> {
                    //logic
                    return "brand is null";
                });
        System.out.println(theBrand);
    }


    //Optional.of - when we know that the object being passed will never be null
    //Option.ofNullable - when the object passed can be null or not be null
    //Reference - https://www.baeldung.com/java-optional
}
