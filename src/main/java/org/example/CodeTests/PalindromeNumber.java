package org.example.CodeTests;

public class PalindromeNumber {
    /*
    * Given an integer x, return true if x is a  palindrome, and false otherwise.
    * */

    public boolean isPalindrome(int x) {
        boolean isPalindrome = false;
        String s = String.valueOf(x);

        System.out.println("s : " + s);
        System.out.println("x : " + x);
        System.out.println("s.length()%2 : " + s.length()%2);

        //음수가 아니고, palindrome이 되기 위해선 length가 홀수여야함.
        if(x >  0 && s.length()%2 != 0  ){
            //문자열의 길이 반만 돌려서 0번째와 마지막, 첫번쨰와 마지막-1 ... 같은지 확인
            for(int i=0; i< s.length()/2 ; i++){
                int cnt = i +1;
                int lastIndex = s.length() - cnt;

                char left = s.charAt(0);
                char right = s.charAt(lastIndex);
                System.out.println("left : " + left);
                System.out.println("right : " + right);

                if(left == right) isPalindrome = true;
                else isPalindrome = false;
            }
        }else{
            System.out.println("ELSE");
        }
        return isPalindrome;
    }
}
