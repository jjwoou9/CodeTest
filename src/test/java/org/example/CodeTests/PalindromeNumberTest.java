package org.example.CodeTests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {

    @Test
    public void Test1(){
        // Input: x = 121
        // Output: true
        int x = 121;

        boolean expected = true;
        boolean isPalindrome = isPalindrome(x);
        Assertions.assertEquals(expected, isPalindrome);
    }

    @Test
    public void Test2(){
        // Input: x = -121
        // Output: false
        int x = -121;

        boolean expected = false;
        boolean isPalindrome = isPalindrome(x);
        Assertions.assertEquals(expected, isPalindrome);
    }

    @Test
    public void Test3(){
        // Input: x = 10
        // Output: false
        int x = 10;

        boolean expected = false;
        boolean isPalindrome = isPalindrome(x);
        Assertions.assertEquals(expected, isPalindrome);
    }

    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String s = String.valueOf(x);

        if(x >  0 && s.length()%2 != 0  ){
            for(int i=0; i< s.length()/2 ; i++){
                int cnt = i +1;
                int lastIndex = s.length() - cnt;

                char left = s.charAt(0);
                char right = s.charAt(lastIndex);

                System.out.println("left : " + left );
                System.out.println("right : " + right );

                if(left == right) isPalindrome = true;
                else isPalindrome = false;
            }
        }
        return isPalindrome;
    }

}