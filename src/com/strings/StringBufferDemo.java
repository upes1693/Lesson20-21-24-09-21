package com.strings;

public class StringBufferDemo {
    public static void main(String[] args) {
        //StringBuffer is mutable
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println(stringBuffer);
        //String s=stringBuffer.toString();
        stringBuffer.insert(0,"abc");
        System.out.println(stringBuffer);
        stringBuffer.replace(0,3,"Replace value");
        System.out.println(stringBuffer);
        stringBuffer.delete(5,10);
        System.out.println(stringBuffer);
        stringBuffer.reverse();
        System.out.println(stringBuffer);
        stringBuffer.capacity();
        String str=stringBuffer.substring(7);
        System.out.println(stringBuffer);
        System.out.println(str);
        int number=stringBuffer.indexOf("H");
        System.out.println(number);
    }
}
