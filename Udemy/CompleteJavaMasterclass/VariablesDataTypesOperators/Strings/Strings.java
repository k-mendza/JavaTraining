package Udemy.CompleteJavaMasterclass.VariablesDataTypesOperators.Strings;

public class Strings 
{
    public static void main(String[] args)
    {
        int result = 1 + 2;
        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);
        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);
        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);
        previousResult = result;
        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result+=2;
        System.out.println(result);
        result-=2;
        System.out.println(result);
        result*=2;
        System.out.println(result);
        result/=2;
        System.out.println(result);

        boolean isAlien = true;
        if (isAlien == true)  // is equal to
            System.out.println("It's not an alien!");

        int topScore = 99;
        if (topScore != 100)  // not equal to
            System.out.println("You don't have the top score!");
        int secondTopCore = 80;
        if (topScore > secondTopCore && topScore < 100)
            System.out.println("Greater than secondTopScore and also lesser than 100");

        if ((topScore>90) || (secondTopCore<=90)) // || stands for or
            System.out.println("One of this tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an true");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen");

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");

        // challenge
        double dVariable = 20.0;
        double d2Variable = 80.0;
        double dResult;
        dResult = (d2Variable + dVariable)*25;
        double dRemainder;
        dRemainder = dResult % 40;
        if (dRemainder<=20)
            System.out.println("Total was over the limit");

        }
    }
