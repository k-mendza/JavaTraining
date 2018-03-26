package udemy.completeJavaMasterclass;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division");
        }
    }

    private static int divide(){
        int x;
        int y;
        try {
            x = getInt();
            y = getInt();
            System.out.println("X is: " + x + " Y is: " + y);
            return x/y;
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("No suitable input");
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
