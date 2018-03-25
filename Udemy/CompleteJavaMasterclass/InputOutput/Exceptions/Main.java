package udemy.completeJavaMasterclass;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * LBYL - Look Before You Leave
         * EAFP - Easier Ask for Forgiveness than Permission
         * two different approaches of handling exceptions presented below
         */

//        int x = 98;
//        int y = 0;
//        System.out.println(divideLBYL(x, y)); // works ok
//        System.out.println(divideEAFP(x, y)); // works ok
//        System.out.println(divide(x, y)); // crashes
        int x = getIntEAFP();
        System.out.println("X = " + x);
    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of X:");
        return scanner.nextInt();
    }

    private static int getIntEAFP(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter value of integer: ");
        try {
            return scanner.nextInt();
        } catch (Exception e) {
            System.out.println(e);
            return 0;
        }
    }

    private static int getIntLBYL(){
        Scanner scanner = new Scanner(System.in);
        boolean valid = true;
        System.out.println("Please enter value of integer: ");
        String input = scanner.next();
        for (int i=0; i<input.length(); i++){
            if (!Character.isDigit(input.charAt(i))){
                valid = false;
                break;
            }
        }
        if (valid){
            return Integer.parseInt(input);
        }
        return 0;
    }

    private static int divideLBYL(int x, int y){
        if (y != 0) {
            return x/y;
        } else {
            return 0;
        }
    }

    private static int divideEAFP(int x, int y){
        try {
            return x/y;
        } catch (Exception e){
            System.out.println(e);
            return 0;
        }
    }

    private static int divide(int x, int y){
        return x/y;
    }
}
