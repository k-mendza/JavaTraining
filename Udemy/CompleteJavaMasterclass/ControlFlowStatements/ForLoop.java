package Udemy.CompleteJavaMasterclass.ControlFlowStatements;

public class ForLoop
{
    public static void main(String[] args)
    {
//        System.out.println("10,000 at 2% interest is: " + calculateInterest(10000, 2));
//        System.out.println("10,000 at 3% interest is: " + calculateInterest(10000, 3));
//        System.out.println("10,000 at 4% interest is: " + calculateInterest(10000, 4));
//        System.out.println("10,000 at 5% interest is: " + calculateInterest(10000, 5));
//        System.out.println("10,000 at 6% interest is: " + calculateInterest(10000, 6));

        // more efficient way of doing things like this is to use for loop as shown below:
        for (int i =2;i<9;i++)
        {
            // calling method calculateInterest for different interest rates iterated in for loop
            System.out.println("10,000 at "+i+"% interest is: " + String.format("%.2f", calculateInterest(10000, (double) i)));
            // note String.format method with parameter "%.2f"
        }
        int start = 1;
        int stop = 10000;

        for ( int i = start; i <= stop; i++)
        {
            if (isPrime(i)== true)
            {
                System.out.println(i + " is prime number");
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount*(interestRate/100));
    }
    public static boolean isPrime(int n)
    {
        if (n==1)
        {
            return false;
        }
        for (int i=2; i <= n/2; i++)
        {
            if (n%i ==0)
            {
                return false;
            }
        }
        return true;
    }
}
