package com.carmen;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>();

        int length = 100;
        for (int i = 1; i <= length; i++){
            arrayList.add(i);
        }
        for (int elem = 0; elem < arrayList.size(); elem++){
            System.out.println(arrayList.get(elem));
        }
        System.out.println(binarySearch(arrayList, 110));
        System.out.println(binarySearch(arrayList, -1));
        System.out.println(binarySearch(arrayList, 0));
        System.out.println(binarySearch(arrayList, 89));
    }

    public static boolean binarySearch(ArrayList<Integer> list, int value){
        if (value > list.size() || value < 0){
            System.out.println("Search value must be lower than list size and higher or equal to 0");
            return false;
        } else if (value == 0){
            return true;
        }
        int min = 0;
        int max = list.size();
        int mid = (min + max) / 2;
        boolean flag = false;

        while (flag == false){
            if (list.get(mid) == value){
                System.out.println("Flag called");
                flag = true;
            } else if (list.get(mid) > value){
                max = mid;
                mid = (min + max) / 2;
                System.out.println("Min: " + min + ", Mid: " + mid + ", Max: " + max);
            } else if (list.get(mid) < value){
                min = mid;
                mid = (min + max) / 2;
                System.out.println("Min: " + min + ", Mid: " + mid + ", Max: " + max);
            }
        }
        return flag;
    }
}
