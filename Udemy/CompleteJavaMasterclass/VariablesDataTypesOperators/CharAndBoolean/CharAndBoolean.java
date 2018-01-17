package Udemy.CompleteJavaMasterclass.VariablesDataTypesOperators;

public class CharAndBoolean
{
    public static void main(String[] args)
    {
    // backslash u stands for unicode 00A9 is code for special sign
	char myChar = '\u00A9';
	System.out.println(myChar);
	boolean myBoolean = true;
	System.out.println(myBoolean);
	// challenge find assign to char and print registered special sign
	char registeredChar = '\u00AE';
	System.out.println(registeredChar);
    }
}
