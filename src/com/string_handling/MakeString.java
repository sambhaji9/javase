package com.string_handling;

public class MakeString {
    public static void main(String[] args) {
        char c[] = {'j', 'a', 'v', 'a'};

        String string1 = new String(c);
        String string2 = new String(string1);

        System.out.println(string1);
        System.out.println(string2);
    }
}
