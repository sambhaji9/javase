package com.util;

import java.util.Formatter;

public class FormatDemo3 {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        formatter.format("Copying file%nTransfer id %d%% complete", 88);
        System.out.println(formatter);
        formatter.close();
    }
}
