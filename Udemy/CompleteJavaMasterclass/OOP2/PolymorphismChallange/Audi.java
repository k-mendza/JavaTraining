package Udemy.CompleteJavaMasterclass.PolymorphismChallenge;

public class Audi extends Car {
    public Audi(String name, int cylindersNumber) {
        super(name, cylindersNumber);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("like Audi");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("like Audi");
    }
}
