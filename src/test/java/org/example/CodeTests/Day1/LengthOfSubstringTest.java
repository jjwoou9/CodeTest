package org.example.CodeTests.Day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfSubstringTest {

    @Test
    public void test1(){
        // Input: s = "abcabcbb"
        // Output: 3

        String s = "abcabcbb";
        int expected = 3;
        int actual = getLengthOfLongestSubstringV2(s);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        // Input: s = "bbbbb"
        // Output: 1

        String s = "bbbbb";
        int expected = 1;
        int actual = getLengthOfLongestSubstringV2(s);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void test3(){
        // Input: s = "pwwkew"
        // Output: 3

        String s = "pwwkew";
        int expected = 3;
        int actual = getLengthOfLongestSubstringV2(s);

        Assertions.assertEquals(expected, actual);

    }

    public int getLengthOfLongestSubstring(String s) {
        HashSet<Character> set = new LinkedHashSet<>();

        // add each character to the set
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        // convert the set back to a string
        StringBuilder sb = new StringBuilder();
        for (Character ch : set) {
            sb.append(ch);
        }
        String result = sb.toString();

        System.out.println("Original string: " + s);
        System.out.println("String with duplicates removed: " + result);

        return result.length();
    }

    public int getLengthOfLongestSubstringV2(String s) {
        Set<Character> set = new HashSet<>();
        int i = 0, j = 0, maxLen = 0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return maxLen;
    }
}