package com.lang;

public class MemoryDemo {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        long memory1, memory2;

        Integer someints[] = new Integer[1000];

        System.out.println("Total memory is: " + runtime.totalMemory());
        memory1 = runtime.freeMemory();
        System.out.println("Initial free memory: " + memory1);

        runtime.gc();

        memory1 = runtime.freeMemory();
        System.out.println("Free memory after garbage collection: " + memory1);

        // allocate integers
        for (int i = 0; i < 1000; i++) {
            someints[i] = Integer.valueOf(i);
        }
        memory2 = runtime.freeMemory();
        System.out.println("Free memory after allocation: " + memory2);

        System.out.println("Memory used by allocation: " + (memory1 - memory2));

        // discard integers
        for (int i = 0; i < 1000; i++) {
            someints[i] = null;
        }
        // request garbage collection
        runtime.gc();

        memory2 = runtime.freeMemory();
        System.out.println("Free memory after collecting discarded integers: " + memory2);
    }
}
