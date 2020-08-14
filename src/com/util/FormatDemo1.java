package com.util;

import java.util.Formatter;

public class FormatDemo1 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Formatting %s is easy %d %f", "with java", 10, 98.6);

        System.out.println(formatter);
        formatter.close();
    }
}
