package com.example.helloapp;
public class App {
    public static void main(String[] args) {
        // Step 1: Check if arguments are provided
        if (args.length == 0) {
            // Step 2: Default greeting if no arguments
            System.out.println("Hello, World!");
        } else {
            // Step 3: Use StringBuilder for efficient string building
            StringBuilder nameBuilder = new StringBuilder();
            boolean first = true;

            // Step 4: Enhanced for loop to iterate through all arguments
            for (String name : args) {
                if (!first) {
                    nameBuilder.append(", ");
                }
                nameBuilder.append(name);
                first = false;
            }

            // Step 5: Print the final concatenated greeting
            System.out.println("Hello, " + nameBuilder.toString() + "!");
        }
    }
}