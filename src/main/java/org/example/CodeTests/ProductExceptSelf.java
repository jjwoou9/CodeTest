package org.example.CodeTests;

public class ProductExceptSelf implements TestCode<int[], int[]> {
    /*
    * Given an integer array nums, return an array answer such that answer[i] is equal to
    * the product of all the elements of nums except nums[i].
    * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    * You must write an algorithm that runs in O(n) time and without using the division operation.    *
    * */


    /*
    * EX1
    * Input: nums = [1,2,3,4]
    * Output: [24,12,8,6]
    *
    * EX2
    * Input: nums = [-1,1,0,-3,3]
    * Output: [0,0,9,0,0]
    *
    * */

    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i ++){
            int x = 1;
            for(int j = 0 ; j < nums.length; j++){
                if(i != j) x = x * nums[j];
            }
            arr[i] = x;
        }
        return arr;
    }

    @Override
    public int[] test(int[] value) {
        return this.productExceptSelf(value);
    }
}
