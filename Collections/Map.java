package com.karmen;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map {

    public static void main(String[] args) {
        // Map is not a part of Collection API
        // Stores map of keys to value connections
        // Adding and accessing the element requires key
        // Key must be an object
        // Values can repeat but Keys not

        /**
         * Implementations:
         * HashMap - non sorted
         * LinkedHashMap - key values order is maintained
         * TreeMap - key values are sorted
         * HashTable - archive
         */

        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("VAL0", 0);
        hashMap.put("VAL1", 1);
        hashMap.put("VAL2", 2);
        hashMap.put("VAL3", 3);
        hashMap.put("VAL4", 4);
        hashMap.put("VAL5", 5);
        hashMap.put("VAL6", 4);
        hashMap.put("VAL7", 2);
        hashMap.put("VAL8", 0);

        System.out.println(hashMap.values()); // strange its in order but String does not have equals to method!
        System.out.println("***** New HashMap *****");
        // trying again with int as Key
        HashMap<Integer, String> hashMap1 = new HashMap<>();

        hashMap1.put(6, "One");
        hashMap1.put(5, "Two");
        hashMap1.put(4, "Four");
        hashMap1.put(3, "Six");
        hashMap1.put(2, "Five");
        hashMap1.put(1, "Three");
        hashMap1.put(0, "Zero");
        hashMap1.put(7, "Zero"); // here values are sorted by Hashcode

        System.out.println();

        System.out.println(hashMap1.values());
        System.out.println("***** New LinkedHashMap *****");
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(6, 1);
        linkedHashMap.put(5, 2);
        linkedHashMap.put(4, 3);
        linkedHashMap.put(3, 4);
        linkedHashMap.put(7, 0);
        linkedHashMap.put(2, 5);
        linkedHashMap.put(1, 6);
        linkedHashMap.put(0, 7); // here values are sorted be entry order

        System.out.println(linkedHashMap.values());

        System.out.println("***** New TreeMap *****");
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(10, 0);
        treeMap.put(9, 1);
        treeMap.put(100, 11);
        treeMap.put(23, 17); // here values are sorted by key value

        System.out.println(treeMap.values());

    }
}
