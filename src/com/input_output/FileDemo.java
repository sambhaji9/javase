package com.input_output;

import java.io.File;

public class FileDemo {

    static void p(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        File file = new File("C:\\Users\\cc313640\\Desktop\\points-from-the-meetings.md");

        p("File name: " + file.getName());
        p("Path: " + file.getPath());
        p("Absolute path: " + file.getAbsolutePath());
        p("Parent: " + file.getParent());
        p(file.exists() ? "Exists" : "Do not exists");
        p(file.canRead() ? "is readable" : "cannot read the file");
        p(file.canWrite() ? "is writable" : "cannot write the file");
        p("is " + (file.isDirectory() ? "" : "not" + " a directory"));
        p("is " + (file.isFile() ? "normal file" : "might be a named pipe"));
        p(file.isAbsolute() ? "is absolute" : "is not absolute");
        p("File last modified: " + file.lastModified());
        p("File size: " +  file.length() + " bytes");
    }
}
