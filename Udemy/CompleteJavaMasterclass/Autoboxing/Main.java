package Udemy.CompleteJavaMasterclass.Arrays.AutoBoxing;

import java.util.ArrayList;

public class Main {

    class IntClass{
        private int myValue;

        public IntClass(int myValue) {
            this.myValue = myValue;
        }

        public int getMyValue() {
            return myValue;
        }

        public void setMyValue(int myValue) {
            this.myValue = myValue;
        }
    }

    public static void main(String[] args){
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Kar");

        // ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        //IntClass obj = new IntClass(54);
        //intClassArrayList.add();
        Integer integer = new Integer(54);
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i =0; i<=10; i++){
            // taking primitive type into object wrapper (autoboxing)
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i =0; i<=10; i++){
            // taking primitive type from object (unboxing)
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
        }
        // boxing
        Integer myIntValue = 56;
        // unboxing
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleArrayList = new ArrayList<Double>();
        for (double dbl = 0.0; dbl <=10.0; dbl += 0.5){
            myDoubleArrayList.add(dbl);
        }
        for (int i =0; i<myDoubleArrayList.size(); i++){
            double value = myDoubleArrayList.get(i);
            System.out.println(i + "-->" + value);
        }
    }
}
