package com.lyomann.datastructures;


import java.util.Stack;

public class WorkingWithStacks {
    public static void main(String[] args) {
        Stack<Integer> stack =  new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack.peek());
        stack.pop(); // removes whats on top of the stack
        System.out.println(stack);

        // Stack - Data structure in which the last element that comes in is the first one out


    }

}
