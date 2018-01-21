package Udemy.CompleteJavaMasterclass.Challenge;

public class Vehicle
{
    private int size;
    private int maxSpeed;
    private String id;
    private String Manufacturer;

    public Vehicle(int size, int maxSpeed, String id, String manufacturer) {
        this.size = size;
        this.maxSpeed = maxSpeed;
        this.id = id;
        Manufacturer = manufacturer;
    }
    public static int move(int speed){
        System.out.println("Vehicle moving with speed " + speed);
        return speed;
    }
    public static String steer(String direction){
        if (direction == "left"){
            return "left";
        }else if (direction == "right"){
            return "right";
        }else{
            return "no steering input";
        }
    }
}
