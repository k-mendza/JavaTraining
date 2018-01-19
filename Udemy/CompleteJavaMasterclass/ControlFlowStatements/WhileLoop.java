package Udemy.CompleteJavaMasterclass.ControlFlowStatements;

public class WhileLoop
{
    public static void main(String[] args)
    {
        // while is used when there is no clear number of iteration before running loop
        int count = 0;
        while (count != 5){
            System.out.println("Count value is " + count);
            count++;
        }
    }
}
