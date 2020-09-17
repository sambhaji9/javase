package com.collections;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {

    static void showPush(Stack<Integer> stack, int number) {
        stack.push(number);
        System.out.println("Push{" + number + "}");
        System.out.println("Stack: " + stack);
    }

    static void showPop(Stack<Integer> stack) {
        System.out.print("Pop -> ");
        Integer number = stack.pop();
        System.out.println("Stack: " + stack);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Stack: " + stack);

        showPush(stack, 42);
        showPush(stack, 66);
        showPush(stack, 99);

        showPop(stack);
        showPop(stack);
        showPop(stack);

        try {
            showPop(stack);
        } catch (EmptyStackException emptyStackException) {
            System.out.println("Empty stack");
        }

    }
}
