package com.karmen;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

    public static void main(String[] args) {
        // elements in Set can NOT repeat
        // elements can be sorted or not depending on the implementation
        // can only access iterators
        // you can check if something is in the set but you cant access the data

        /**
         * HashSet - NON sorted
         *
         * LinkedHashSet - sorted
         *
         * TreeSet - sorted if objects implement Comparable interface
         */

        HashSet<String> set = new HashSet<String>();
        set.add("Four");
        set.add("One");
        set.add("Two");
        set.add("Five");
        set.add("Three"); // different order of elements is printed out

        System.out.println(set.add("One")); // false because One is already in the set

        // printing elements using iterator
        for (String string : set){
            System.out.println(string);
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(4);
        linkedHashSet.add(2);
        linkedHashSet.add(0);
        linkedHashSet.add(1);
        linkedHashSet.add(3); // LinkedHashSet maintains order of input

        // printing elements using iterator
        for (Integer integer : linkedHashSet){
            System.out.println(integer);
        }

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(100);
        treeSet.add(80);
        treeSet.add(50);
        treeSet.add(73);
        treeSet.add(65);
        treeSet.add(489);
        treeSet.add(10);
        treeSet.add(20); // TreeSet additionally sorts elements

        for (Integer integer : treeSet){
            System.out.println(integer);
        }
    }
}
