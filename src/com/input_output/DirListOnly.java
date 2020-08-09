package com.input_output;

import java.io.File;
import java.io.FilenameFilter;

public class DirListOnly {
    public static void main(String[] args) {

        String dirName = "C:\\development\\ewco-frontend";
        File file = new File(dirName);

        FilenameFilter only = new OnlyExt("cmd");
        String s[] = file.list(only);

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
