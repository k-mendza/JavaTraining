package Udemy.CompleteJavaMasterclass.VariablesDataTypesOperators;

public class Strings
{
    public static void main(String[] args)
    {
        // String is not a primitive type its a class
        String myString = "This is string"; // note the double quote!
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to: " + myString);  // join of two strings
        String number = "250.75";
        number = number + "50.23";  // there is no addition because of type of the variables
        System.out.println(number);

        String lastString = "10";
        lastString = lastString + 50;  // this is valid java code that will be converted into string
        System.out.println(lastString);
    }
}
