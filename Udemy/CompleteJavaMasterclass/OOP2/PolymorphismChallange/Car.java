package Udemy.CompleteJavaMasterclass.PolymorphismChallenge;

public class Car {
    private String name;
    private int cylindersNumber;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylindersNumber) {
        this.name = name;
        this.cylindersNumber = cylindersNumber;
        this.wheels = 4;
        this.engine = true;
    }

    public void engineStart(){
        this.engine = true;
    }
    public void engineStop(){
        this.engine = false;
    }
    public void accelerate(){
        System.out.println("Accelerating");
    }
    public void brake(){
        System.out.println("Breaking");
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public String getName() {

        return name;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}
