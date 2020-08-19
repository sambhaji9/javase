package com.string_handling;

class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    @Override
    public String toString() {
        return "Dimensions are " + width + " by " + depth + " by " + height;
    }
}

public class ToStringdemo {
    public static void main(String[] args) {
        Box box = new Box(10, 20, 30);
        String string = "Box box: " + box;

        // convert Box to string
        System.out.println(box);
        System.out.println(string);
    }
}
