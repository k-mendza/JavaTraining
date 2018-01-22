package Udemy.CompleteJavaMasterclass.Polymorphism;

public class IndependenceDay extends Movie{
    public IndependenceDay(){
        super("Independence Day");
    }
    @Override
    public String plot(){
        return "Aliens, aliens everywhere";
    }
}
