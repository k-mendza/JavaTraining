package Udemy.CompleteJavaMasterclass.InnerClass.Abstraction;

public class Main {
    public static void main(String[] args){
        Dog dog = new Dog("Mayke");
        dog.breathe();
        dog.eat();
        Parrot parrot = new Parrot("Parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("Penguin");
        penguin.eat();
        penguin.fly();
    }
}
