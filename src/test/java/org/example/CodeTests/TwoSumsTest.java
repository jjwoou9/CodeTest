package org.example.CodeTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    @Test
    public void Test1(){
        //Exmaple1  nums = [2,7,11,15], target = 9  : answer : [0,1]
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] answer = {0,1};
        int[] solve = twoSumWithStream(nums, target);

        assertTests(answer, solve);
    }

    @Test
    public void Test2() {
        //Exmaple2  nums = [3,2,4], target = 6  : answer : [1,2]
        int[] nums = {3,2,4};
        int target = 6;
        int[] answer = {1,2};
        int[] solve = twoSumWithStream(nums, target);

        assertTests(answer, solve);
    }

    @Test
    public void Test3() {
        //Exmaple3  nums = [3,3], target = 6  : [0,1]
        int[] nums = {3,3};
        int target = 6;
        int[] answer = {0,1};
        int[] solve = twoSumWithStream(nums, target);

        assertTests(answer, solve);
    }

    private void assertTests(int[] answer, int[] solve){
        Arrays.sort(solve);
        boolean areEqual = Arrays.equals(answer, solve);
        System.out.println(areEqual);
        Assertions.assertTrue(areEqual);
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