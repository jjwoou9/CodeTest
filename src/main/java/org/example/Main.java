package org.example;

import org.example.CodeTests.PalindromeNumber;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Test
        PalindromeNumber test = new PalindromeNumber();
        boolean isPal = test.isPalindrome(-121);

        System.out.println("isPal " + isPal);


    }

}