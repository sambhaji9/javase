package com.string_handling;

public class ConcatReplaceDemo {
    public static void main(String[] args) {
        String string1 = "one";
        String string2 = string1.concat(" two");

        System.out.println("string1.concat(two): " + string2);
        System.out.println("string1 + two: " + (string1 + " two"));

        String string3 = "Hello".replace('l', 'w');
        System.out.println(string3);
    }
}
