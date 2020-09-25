package com.lyomann.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.add(new Person("Ly"));
        queue.add(new Person("Ty"));
        queue.add(new Person("Olu"));
        System.out.println(queue);
        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

    }

    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    // Queue - First element that comes in is the First to go out
}
