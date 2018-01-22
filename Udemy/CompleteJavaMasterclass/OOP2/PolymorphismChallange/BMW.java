package Udemy.CompleteJavaMasterclass.PolymorphismChallenge;

public class BMW extends Car {
    public BMW(String name, int cylindersNumber) {
        super(name, cylindersNumber);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        System.out.println("like BMW");
    }

    @Override
    public void brake() {
        super.brake();
        System.out.println("like BMW");
    }
}
