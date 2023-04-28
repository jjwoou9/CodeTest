package org.example;

import org.example.CodeTests.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        //Test
        /*
        * PalindromeNumber test = new PalindromeNumber();
        * boolean isPal = test.isPalindrome(-121);
        * */

        TestCode test = new PalindromeNumber();
        //Boolean isPal = (Boolean) test.test(121);
        //System.out.println("isPal : " + isPal);

        test = new MaxProfit();
        int[] prices1 = {7,1,5,3,6,4};
        int[] prices2 = {7,6,4,3,1};

        //int profit = (int) test.test(prices2);
        //System.out.println("profit : " + profit);

/*
        test = new ContainsDuplicate();
        int[] nums = {1,2,3,1};
        Boolean isDup = (Boolean) test.test(nums);
        System.out.println("isDup : " + isDup);
*/

        test = new ProductExceptSelf();
        //int[] nums = {1, 2, 3, 4};
        int[] nums = {-1,1,0,-3,3};
        int[] arr = (int[]) test.test(nums);
        System.out.println("arr : " + Arrays.toString(arr));



    }

}