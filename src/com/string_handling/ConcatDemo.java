package com.string_handling;

public class ConcatDemo {
    public static void main(String[] args) {
        String longString = "This could have been" + " a very long line that would have " +
                "wrapped around. But string concatenation prevent this";
        System.out.println(longString);
        System.out.println();

        // concat with other data types
        int age = 38;
        String string = "I am " + age + " years old";
        System.out.println(string);

        String string1 = "Four: " + 2 + 2;
        System.out.println(string1);

        String string2 = "Four: " + (2 + 2);
        System.out.println(string2);
    }
}
