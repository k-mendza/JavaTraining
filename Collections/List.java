package com.karmen;

import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        // List can dynamically change its size
        // elements can repeat in the List
        // all elements must be of the same type
        // all elements must be objects
        // There are several popular types of Lists:

        /**
         * ArrayList - objects are not linked
         *
         * LinkedList - objects are linked takes more space than ArrayList
         *
         * Vector - older version of ArrayList
         */

        // initialization of ArrayList
        ArrayList<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("One");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        printList(list);
        list.remove("One");
        System.out.println("***** Removing One *****");
        printList(list);
        list.remove("One");
        System.out.println("***** Removing One *****");
        printList(list);
        System.out.println(list.remove("One"));
    }

    public static void printList(ArrayList list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
