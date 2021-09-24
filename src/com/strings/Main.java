package com.strings;

public class Main {

    public static void main(String[] args) {
        String s="some string";
        String s2=new String("another string");
        char[] ch={'H','e','l','l','o'};
        String s3=new String(ch);
        System.out.println(s3);

        String str="Charlie";
        String str2="Charlie";
        str="Mark";
        System.out.println(str2);

        str=str.concat(" Finkel");
        System.out.println(str);
        System.out.println("----------------------------------------");

        String string1="Hello";
        String string2="Hello";

        boolean b= string1.equals(string2);
        System.out.println(b);

        String string3=new String("Hello");
        boolean b2= string1.equals(string3);
        System.out.println(b2);

        String string4="s";
        boolean b3= string1.equals(string4);
        System.out.println(b3);

        String string5="helLo";
        boolean b4= string1.equals(string5);
        System.out.println(b4);


        boolean b5= string1.equalsIgnoreCase(string5);
        System.out.println(b5);
        System.out.println("-----------------------------");

        System.out.println(string1==string2);
        System.out.println(string1==string3);

        System.out.println("-----------------------------");
        String string6="HEllo";
        String string7="Hello";
        String string8="Hello2";
        System.out.println(string6.compareTo(string7));
        //System.out.println(string6.compareTo(string8));

        String animal="cat1";
        String animal2="cat10";
        System.out.println(animal.compareTo(animal2));
    }
}
