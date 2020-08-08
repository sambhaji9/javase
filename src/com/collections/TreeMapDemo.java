package com.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        // create a TreeMap
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();

        // put elements to map
        // put elements to the map
        treeMap.put("Sambhaji Mane", 1234.56);
        treeMap.put("Sadhana Mane", 285285.56);
        treeMap.put("Satyam Mane", 265429.56);
        treeMap.put("Aaradhya Mane", 2879425.56);

        System.out.println("Tree map sorts the output in ascending order");
        System.out.println(treeMap);

        System.out.println("");
        // get the entries in the map
        Set<Map.Entry<String, Double>> set = treeMap.entrySet();

        // show the keys and their values
        for(Map.Entry<String, Double> me: set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        System.out.println();

        // deposit 1000 into Sambhaji's account
        double balance = treeMap.get("Sambhaji Mane");
        treeMap.put("Sambhaji Mane", balance + 1000);

        System.out.println("Sambhaji's new balance: " + treeMap.get("Sambhaji Mane"));
    }
}
