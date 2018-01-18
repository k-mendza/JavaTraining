package Udemy.CompleteJavaMasterclass.ExpressionsStatementsCodeBlocksAndMethods;

public class MethodOverloading
{
    public static void main(String[] args)
    {
//        int newScore = calculateScore("Kar", 500);
//        System.out.println("New score is " + newScore);
//        int anotherScore = calculateScore(10);
//        System.out.println("Another score is " + anotherScore);
        calcFeetAndInchesToCentimeters(-10,5);
        calcFeetAndInchesToCentimeters(10,-5);
        calcFeetAndInchesToCentimeters(-10);
        calcFeetAndInchesToCentimeters(157);
        //calcFeerAndInchesToCentimeters(0);
        //calcFeerAndInchesToCentimeters(6,-10);
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score *1000;
    }
    // overloaded method calculateScore is recognized by entry parameters
    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score *1000;
    }
    // overloaded methods have unique signature: number and type of parameters and name of the method
    public static int calculateScore()
    {
        System.out.println("Unnamed player scored no points");
        return 0;
    }

    // challenge from the course is to create 1 method and then overload. Then use the 1 method inside 2nd method

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        if (feet >= 0)
        {
            if (inches >=0 && inches <= 12)
            {
                //System.out.println((feet * 12d + inches)*2.54d + " cm");
                return (feet * 12d + inches)*2.54d;
            }
            else
            {
                System.out.println("Incorrect input: value of inches must be between 0 and 12");
                return -1;
            }
        }
        else
        {
            System.out.println("Incorrect input: feet must be >= 0");
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches)
    {
            if (inches >=0)
            {
                double feetFromInches =  inches/12;
                System.out.println(calcFeetAndInchesToCentimeters(feetFromInches,0) + " cm");
                return calcFeetAndInchesToCentimeters(feetFromInches,0);
            }
            else
            {
                System.out.println("Incorrect input: value of inches must be between 0 and 12");
                return -1;
            }
        }
    }

