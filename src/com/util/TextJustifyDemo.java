package com.util;

import java.util.Formatter;

public class TextJustifyDemo {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        // right justify by default
        formatter.format("|%10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();

        // left justify
        formatter = new Formatter();
        formatter.format("|%-10.2f|", 123.123);
        System.out.println(formatter);
        formatter.close();
    }
}
