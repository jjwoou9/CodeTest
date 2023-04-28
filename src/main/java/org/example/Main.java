package org.example;

import org.example.CodeTests.MaxProfit;
import org.example.CodeTests.PalindromeNumber;
import org.example.CodeTests.TestCode;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Test
        /*
        * PalindromeNumber test = new PalindromeNumber();
        * boolean isPal = test.isPalindrome(-121);
        * */

        TestCode test1 = new PalindromeNumber();
        Boolean isPal = (Boolean) test1.test(121);
        System.out.println("isPal : " + isPal);

        TestCode test2 = new MaxProfit();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        int profit = (int) test2.test(prices2);
        System.out.println("profit : " + profit);




    }

}