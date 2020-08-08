package com.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String [] args) {

        // create a HashMap
        HashMap<String, Double> hashMap = new HashMap<String, Double>();

        // put elements to the map
        hashMap.put("Sambhaji Mane", 1234.56);
        hashMap.put("Sadhana Mane", 285285.56);
        hashMap.put("Satyam Mane", 265429.56);
        hashMap.put("Aaradhya Mane", 2879425.56);

        // display the hashMap
        System.out.println(hashMap);

        // get a set of entries
        Set<Map.Entry<String, Double>> set = hashMap.entrySet();

        // display the set
        System.out.println("\nDisplay the set: ");
        for(Map.Entry<String, Double> me: set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }

        // deposit some money in Sambhaji's account
        double balance = hashMap.get("Sambhaji Mane");
        hashMap.put("Sambhaji Mane", balance + 1000);

        System.out.println("\nSambhaji's new balance: " + hashMap.get("Sambhaji Mane"));
    }
}
