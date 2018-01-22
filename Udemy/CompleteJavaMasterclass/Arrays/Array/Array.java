package Udemy.CompleteJavaMasterclass.Arrays.Array;

import java.util.Scanner;

public class Array {
    private static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {

        // first way to initialize array
	    // int[] myIntArray = {1, 2, 3, 4, 5 ,6 ,7 ,8 ,9,10};
	    // array index starts at 0
        // second way to initialize array
        // myIntArray[6] = 50;

//        float[] myFloatArray = new float[10];
//        for (int i=0; i<10; i++){
//            myFloatArray[i] = i*10;
//        }

        // arrays can be of various types but all elements must be of the same type
        //double[] myDoubleArray = new double[20];
        //System.out.println(myIntArray[6]);
        int[] myIntArray = getIntegers(5);
        for (int i=0; i<myIntArray.length;i++){
            System.out.println("Element "+i+" typed value was " + myIntArray[i]);
        }
        System.out.println(getAverage(myIntArray));
    }
    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values\n");
        int[] values = new int[number];

        for (int i =0; i<values.length; i++){
            values[i] = s.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum =0;
        for (int i =0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double)array.length;
    }
}
