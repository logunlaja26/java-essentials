package com.lyomann.nullandoptionals;

public class NullPointer {
    public static void main(String[] args) {
        String brand = null;

        try{
            System.out.println(brand.toUpperCase());
        } catch(NullPointerException e){
            System.out.println("Brand  is null");
        }


        // 2. Method to handle NullPointerException
        if(brand != null){
            System.out.println(brand);
        } else {
            System.out.println("Brand  is null");
        }
    }

    //null - means that there is nothing in the object
    //NullPointerException - whatever you're trying to access doesn't have a value
    //Inside of objects we have properties and attributes
    //If any of those properties of the object are null and you try to invoke a method on it, you'll get a NullPointerException
    //null value can only be assigned to reference and complex type objects. Can't assign null value to an int
}
