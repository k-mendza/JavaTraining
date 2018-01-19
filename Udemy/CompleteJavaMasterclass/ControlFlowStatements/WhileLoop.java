package Udemy.CompleteJavaMasterclass.ControlFlowStatements;

public class WhileLoop
{
    public static void main(String[] args)
    {
        // while is used when there is no clear number of iteration before running loop
        int count = 0;
        while (count != 6){
            System.out.println("Count value is " + count);
            count++;
        }

        count = 1;
        while (true)
        {
            if (count == 6){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }
        // infinite loop if count = 6
        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        }while (count !=6);


        int start = 1;
        int stop = 30;
        int counter = 0;
        while (start <= stop && counter != 5){
            if (isEvenNumber(start) == true)
            {
                System.out.println(start);
                counter++;
            }
            start++;
        }

    }
    public static boolean isEvenNumber(int number){
        if ((number % 2) == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
