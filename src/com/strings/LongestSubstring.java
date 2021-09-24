package com.strings;

public class LongestSubstring {
    public static void main(String[] args) {
        String str="abcdeabcbb";
        int length=longestUniqueSubstring(str);
        System.out.println(length);
    }

    public static int longestUniqueSubstring(String str){
        String test="";
        int maxLength=-1;

        if(str.isEmpty()){
            return 0;
        }
        else if(str.length()==1){
            return 1;
        }
        for(char c:str.toCharArray()){
            String current=String.valueOf(c);

            if (test.contains(current)){
                test=test.substring(test.indexOf(current)+1);
            }
            test=test+c;
            maxLength=Math.max(test.length(),maxLength);
        }

        return  maxLength;
    }
}
