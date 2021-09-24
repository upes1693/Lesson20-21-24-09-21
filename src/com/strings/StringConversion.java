package com.strings;

public class StringConversion {
    public static void main(String[] args) {
        String numStr="999999999";
        int integer=Integer.parseInt(numStr);
        System.out.println(integer);

        String str="true";
        boolean b=Boolean.valueOf(str);
        if (b){
            System.out.println("success");
        }

        String s="Hello";
        Character c=s.charAt(0);
    }
}
