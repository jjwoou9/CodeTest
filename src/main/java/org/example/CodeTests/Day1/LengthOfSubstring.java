package org.example.CodeTests.Day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LengthOfSubstring {
    /*
    * Given a string s, find the length of the longest substring without repeating characters.
    * */

    public int lengthOfLongestSubstring(String s) {
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

    public int lengthOfLongestSubstringV2(String s) {
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
