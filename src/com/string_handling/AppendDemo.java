package com.string_handling;

public class AppendDemo {
    public static void main(String[] args) {
        String string;
        int a = 42;

        StringBuffer stringBuffer = new StringBuffer(40);
        string = stringBuffer.append("a = ").append(a).append("!").toString();
        System.out.println(string);
    }
}
