package com.string_handling;

public class IndexOfDemo {
    public static void main(String[] args) {
        String string = "Now is the time for all good men " +
                "to come to the aid of their of their country";

        System.out.println(string);
        System.out.println("indexOf(t) = " + string.indexOf('t'));
        System.out.println("lastIndexOf(t) = " + string.lastIndexOf('t'));
        System.out.println("indexOf(t, startPoint) = " + string.indexOf('t', 10));
        System.out.println("lastIndexOf(t, startPoint) = " + string.lastIndexOf('t', 60));
        System.out.println("indexOf(the) = " + string.indexOf("the"));
        System.out.println("lastIndexOf(the) = " + string.lastIndexOf("the"));
        System.out.println("indexOf(the, startPoint) = " + string.indexOf("the", 10));
        System.out.println("lastIndexOf(the, startPoint) = " + string.lastIndexOf("the", 60));
    }
}
