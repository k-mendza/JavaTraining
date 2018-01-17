package Udemy.CompleteJavaMasterclass.VariablesDataTypesOperators.IntShortByteLong;

public class IntShortByteLong 
{

    public static void main(String[] args)
    {
        byte byteValue = 10;  // 1 byte
        short shortValue = 20; // 2 bytes
        int intValue = 50;  // 4 bytes

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);  // when using Long end value with "l"
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
