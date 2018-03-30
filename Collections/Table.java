package com.karmen;

public class Table {

    public static void main(String[] args) {
	    // table can store only basic types of variables
        // table maintains order of stored values (but not necessarily sorted
        // table size cant be changed once initialized
        // table can be declared by two ways:
        String[] table1 = new String[5];
        String table2[] = new String[5];
        String table3[] = {"one", "two", "three", "four", "five"};
        table1[0] = "one";
        table1[1] = "two";
        table1[2] = "three";
        table1[3] = "four";
        table1[4] = "five";
        printTable(table1);
    }

    // method for printing every element in table
    public static void printTable(String[] table){
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i]);
        }
    }
}
