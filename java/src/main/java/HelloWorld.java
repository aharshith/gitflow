package com.example;

import java.util.Random;

public class HelloWorld {

    public static void main(String[] args) {
        // Security Issue: Use of Random for sensitive data
        Random random = new Random();
        int secretNumber = random.nextInt(10);
        System.out.println("Secret Number: " + secretNumber);

        // Reliability Issue: Division by zero
        int x = 10;
        int y = 0;
        System.out.println("Result of division: " + (x / y));

        // Maintainability Issue: Long method
        longMethod();

        // Duplication Issue: Repeated code
        duplicateCode();
        duplicateCode();
    }

    private static void longMethod() {
        // This method is intentionally made long for maintainability issues
        System.out.println("This is a very long method.");
        // ...
    }

    private static void duplicateCode() {
        // Duplication Issue: Repeated code
        System.out.println("This is duplicated code.");
    }
}

