package com.string_handling;

public class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        System.out.println("Buffer before: " + stringBuffer);
        System.out.println("CharAt(1) before: " + stringBuffer.charAt(1));

        stringBuffer.setCharAt(1, 'i');
        stringBuffer.setLength(2);

        System.out.println("Buffer after: " + stringBuffer);
        System.out.println("CharAt(1) after: " + stringBuffer.charAt(1));
    }
}
