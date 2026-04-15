package com.example.helloapp;
public class App {

    public static void main(String[] args) {
        String name;

        // Check if command-line arguments were provided
        if (args.length > 0) {
            StringBuilder nameBuilder = new StringBuilder();
            
            // Iterate through the args array to collect all names
            for (int i = 0; i < args.length; i++) {
                nameBuilder.append(args[i]);
                
                // Add a comma and space between names, but not after the last one
                if (i < args.length - 1) {
                    nameBuilder.append(", ");
                }
            }
            name = nameBuilder.toString();
        } else {
            // Default value if no arguments exist
            name = "World";
        }

        // Display the final greeting
        System.out.println("Hello, " + name + "!");
    }
}
