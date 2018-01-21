package Udemy.CompleteJavaMasterclass.Challenge;

public class Audi extends Car{
    public Audi(int size, int maxSpeed, String id, String manufacturer) {
        super(size, maxSpeed, id, manufacturer);
    }

    public static void quattroDrive(){
        System.out.println("All wheel drive ");
    }
}
