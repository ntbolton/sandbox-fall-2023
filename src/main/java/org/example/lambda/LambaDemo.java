package org.example.lambda;

import java.util.function.*;


public class LambaDemo {

    public static void main(String[] args) {

        // x -> x + 2


        // 4 classes
        // Predicate - takes 1 value and return a boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // Function - takes 1 value and return 1 value
        Function<Integer, Integer> function = x -> x + 2;

        // Supplier - takes nothing returns 1 value
        Supplier<String> supplier = () -> "Hello Lambda!";

        // Consumer - takes 1 value and returns nothing
        Consumer<String> consumer = System.out::println; // or System.out.println(x);







    }



}
