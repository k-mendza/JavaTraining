package udemy.completeJavaMasterclass;

public class Main {

    public static void main(String[] args) {
        /**
         * LBYL - Look Before You Leave
         * EAFP - Easier Ask for Forgiveness than Permission
         * two different approaches of handling exceptions presented below
         */

        int x = 98;
        int y = 0;
        System.out.println(divideLBYL(x, y)); // works ok
        System.out.println(divideEAFP(x, y)); // works ok
        System.out.println(divide(x, y)); // crashes
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

    public static int divide(int x, int y){
        return x/y;
    }
}
