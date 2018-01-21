package Udemy.CompleteJavaMasterclass.Composition;

public class Main {
    public static void main(String[] args){
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("456c", "Dell", "650W", dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS",4,6,"v2,44");

        PC thePc = new PC(theCase, theMonitor,theMotherboard);
        thePc.powerUp();
    }
}
