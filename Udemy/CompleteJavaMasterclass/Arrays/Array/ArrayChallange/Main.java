package Udemy.CompleteJavaMasterclass.Arrays.Challange;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args){
        int[] myIntArray = getIntegers(5);
        int[] sortedArray = sortIntArray(myIntArray);
        printArray(sortedArray);
    }
    // method to fill the array from keyboard
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values\n");
        int[] values = new int[number];

        for (int i =0; i < values.length; i++){
            values[i] = s.nextInt();
        }
        return values;
    }
    // method to sort array and return sorted array
    public static int[] sortIntArray(int[] enterArray){
        int[] sortedArray = new int[enterArray.length];
        // copy array
        for (int i = 0; i<enterArray.length;i++){
                sortedArray[i]=enterArray[i];
        }
        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i =0; i<sortedArray.length-1;i++){
                if (sortedArray[i] < sortedArray[i+1]){
                        temp = sortedArray[i];
                        sortedArray[i] = sortedArray[i+1];
                        sortedArray[i+1] = temp;
                        flag = true;
                }
            }
        }
        return sortedArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
