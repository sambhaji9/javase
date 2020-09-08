package com.string_handling;

public class InfNan {
    public static void main(String[] args) {
        Double double1 = Double.valueOf(1/0.);
        Double double2 = Double.valueOf(0/0.);

        System.out.println(double1 + ": " + double1.isInfinite() + ", " + double1.isNaN());
        System.out.println(double2 + ": " + double2.isInfinite() + ", " + double2.isNaN());
    }
}
