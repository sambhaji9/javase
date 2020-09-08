package com.string_handling;

public class DeleteDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("This is a test");

        stringBuffer.delete(4, 7);
        System.out.println("After delete: " + stringBuffer);

        stringBuffer.deleteCharAt(0);
        System.out.println("After deleteCharAt: " + stringBuffer);
    }
}
