package com.input_output;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirName = "C:\\development\\ewco-frontend";

        File file = new File(dirName);

        if (file.isDirectory()) {
            System.out.println("Directory of " + dirName);
            String s[] = file.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirName + "/" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory");
                } else {
                    System.out.println(s[i] + " is a file");
                }
            }
        } else {
            System.out.println(dirName + " is not a directory");
        }
    }
}
