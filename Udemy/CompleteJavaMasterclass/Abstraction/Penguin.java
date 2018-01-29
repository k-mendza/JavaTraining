package Udemy.CompleteJavaMasterclass.InnerClass.Abstraction;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("Cant fly sorry");
    }
}
