package udemy.completeJavaMasterclass;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        int result = divide();
        System.out.println(result);
    }

    private static int divide(){
        int x;
        int y;
        try {
            x = getInt();
            y = getInt();
        } catch (NoSuchElementException e) {
            throw new ArithmeticException("No suitable input");
        }
        System.out.println("X is: " + x + " Y is: " + y);
        try{
            return x/y;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Attempt to divide by zero");
        }

    }

    /**
     * Method for entering Integer as input to program
     * @return int
     */

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        while (true){
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                // ask for next input
                scanner.nextLine();
                System.out.println("Please enter a number using only the digits from 0 to 9");
            }
        }
    }
}
