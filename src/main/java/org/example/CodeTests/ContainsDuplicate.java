package org.example.CodeTests;

import java.util.Arrays;

public class ContainsDuplicate implements TestCode<Boolean, int[]> {

    /*
    * Given an integer array nums,
    * return true if any value appears at least twice in the array, and return false if every element is distinct.
    */

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean test(int[] value) {
        return this.containsDuplicate(value);
    }
}
