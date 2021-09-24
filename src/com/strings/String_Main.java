package com.strings;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class String_Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str="Hello";
        str = str.concat(" World");
        System.out.println(str);
        String searchStr="He";
        boolean b=str.contains(searchStr);
        System.out.println(b);

        int i= str.indexOf(searchStr);
        System.out.println(i);

        int i2= str.lastIndexOf(searchStr);
        System.out.println(i2);


        //str="   ";
        boolean b2=str.isEmpty();
        System.out.println(b2);
        boolean b3=str.isBlank();
        System.out.println(b3);

        str= str.toLowerCase();
        System.out.println(str);

        str= str.toUpperCase();
        System.out.println(str);

        String a= String.join("-","Hello","World","Mars");
        System.out.println(a);

        String string1="Apple,Orange,Watermelon";
        String[] strArr=string1.split(",");
        System.out.println(strArr.length);
        for (int j = 0; j < strArr.length; j++) {
            System.out.println(strArr[j]);
        }

        int length=str.length();
        System.out.println(length);

        String string12="!!!! Hello ";
        System.out.println(string12);
        string12=string12.trim();
//        System.out.println(string12);

        System.out.println(string12.strip());

        String str12="abc@@@";
        str12=str12.replace("@@","!!");
        System.out.println(str12);

        String aa="Hello"+" World";
        char[] charArr=aa.toCharArray();
        for (int j = 0; j < charArr.length; j++) {
            System.out.println(charArr[j]);
        }

        char c=aa.charAt(1);
        System.out.println("----");
        System.out.println(c);

        System.out.println("-----------");
        String string10="Hello World!";
//        string10=string10.substring(6);
//        System.out.println(string10);
        string10=string10.substring(6,11);
        System.out.println(string10);

        System.out.println("-----------");
        String string11="Hello World!";
        byte[] bytes=string11.getBytes();
        String strCharSet="ASCII";
        byte[] bytes2=string11.getBytes(strCharSet);

        Charset charset= StandardCharsets.UTF_8;

        byte[] bytes3=charset.encode(string11).array();
        String string13=new String(bytes3);

        String string14=charset.decode(ByteBuffer.wrap(bytes3)).toString();

    }
}
