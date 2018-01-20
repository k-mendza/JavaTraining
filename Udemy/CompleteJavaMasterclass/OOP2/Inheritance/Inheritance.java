package Udemy.CompleteJavaMastercalss.OOP2;

public class Inheritance
{
    public static void main(String[] args)
    {
        Animal animal = new Animal("Animal", 1, 1,5 ,5);
        Dog dog = new Dog("Burek", 8,20,2,3,1,4,5,6,"Black");
        dog.eat();
        //dog.run();
        dog.walk();
    }
}
