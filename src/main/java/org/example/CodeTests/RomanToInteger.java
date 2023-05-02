package org.example.CodeTests;

public class RomanToInteger implements TestCode<Integer, String>{
    /*
    * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
    *       Symbol       Value
    *       I             1
    *       V             5
    *       X             10
    *       L             50
    *       C             100
    *       D             500
    *       M             1000
    *
    * */


    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int answer = 0, prev = 0;

        for(char c : chars){
            prev = prev == 0 ? getNumFromChar(c) : prev;
            int temp = getNumFromChar(c);

            answer = prev != 0 && temp > prev ? answer + (temp - (prev*2)) : answer + temp;
            prev = temp;
        }
        return answer;
    }

    private int getNumFromChar(Character roman){

        switch (roman){
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                System.out.println("Invalid grade");
        }
        return 0;
    }

    @Override
    public Integer test(String value) {
        return this.romanToInt(value);
    }
}
