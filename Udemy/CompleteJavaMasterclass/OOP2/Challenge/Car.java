package Udemy.CompleteJavaMasterclass.Challenge;

public class Car extends Vehicle{
    public Car(int size, int maxSpeed, String id, String manufacturer) {
        super(size, maxSpeed, id, manufacturer);
    }

    public static void changeGears(){
        System.out.println("Gear has been changed");
    }
}
