package org.example.CodeTests;

public class LongestCommonPrefix implements TestCode<String, String[]>{

    /*
    * Write a function to find the longest common prefix string amongst an array of strings.
    * If there is no common prefix, return an empty string "".    *
    * */



    /*
     * compare two string and find commons
     *
     * */


    public String longestCommonPrefix(String[] strs) {
        String prefix = strs.length > 1 ? getCommonTwoString(strs[0], strs[1]) : strs[0];
        if(prefix.equals("")) return "";
        else{
            for(String s : strs){
                prefix = getCommonTwoString(prefix, s);
            }
        }
        return prefix;
    }

    private String getCommonTwoString(String str1, String str2){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            if (str1.charAt(i) != str2.charAt(i)) break;
            else builder.append(str1.charAt(i));
        }
        return builder.toString();
    }

    @Override
    public String test(String[] value) {
        return longestCommonPrefix(value);
    }
}
