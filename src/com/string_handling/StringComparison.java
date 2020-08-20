package com.string_handling;

/**
 * Demonstrate equals, startsWith, endsWith comparison methods
 */
public class StringComparison {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = "Good bye";
        String string4 = "HELLO";

        System.out.println("equals and equalsIgnoreCase demo:");
        System.out.println(string1 + " equals " + string2 + " -> " + string1.equals(string2));
        System.out.println(string1 + " equals " + string3 + " -> " + string1.equals(string3));
        System.out.println(string1 + " equals " + string4 + " -> " + string1.equals(string4));
        System.out.println(string1 + " equals " + string4 + " -> " + string1.equalsIgnoreCase(string4));

        System.out.println();
        System.out.println("startsWith and endsWith demo:");

        System.out.println("Foobar.startsWith(Foo): " + "Foobar".startsWith("Foo"));
        System.out.println("Foobar.endsWith(bar): " + "Foobar".endsWith("bar"));
        System.out.println("Foobar.startsWith(bar, 3): " + "Foobar".startsWith("bar", 3));

        System.out.println("\nequals() vs ==");
        String string5 = "Hello";
        String string6 = new String(string5);
        System.out.println(string5 + " equals " + string6 + " -> " + string5.equals(string6));
        System.out.println(string5 + " == " + string6 + " -> " + (string5 == string6));
    }
}
