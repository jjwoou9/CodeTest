package org.example.CodeTests.Day1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class TwoSums {

    /*
    * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    * You may assume that each input would have exactly one solution, and you may not use the same element twice.
    * You can return the answer in any order.
    * */

    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length ; i ++){
            map.put(nums[i], i);
        }

        for(int i =0; i < nums.length ; i ++){
            int diff = target - nums[i];

            if (map.containsKey(diff)) { //has
                answer[0] = i;
                answer[1] = map.get(diff);
            }
        }

        if (answer[0] == 0 && answer[1] == 0) {
            System.out.println("The array has no value inside.");
        }

        return answer;
    }

    public int[] twoSumWithStream(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        return IntStream.range(0, nums.length)
                .filter(i -> {
                    int diff = target - nums[i];
                    if (map.containsKey(diff)) {
                        return true;
                    }
                    map.put(nums[i], i);
                    return false;
                })
                .mapToObj(i -> new int[] {map.get(target - nums[i]), i})
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No two sum solution"));

    }


}
