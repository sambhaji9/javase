package com.string_handling;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Buffer = " + stringBuffer);
        System.out.println("Length = " + stringBuffer.length());
        System.out.println("Capacity = " + stringBuffer.capacity());
    }
}
