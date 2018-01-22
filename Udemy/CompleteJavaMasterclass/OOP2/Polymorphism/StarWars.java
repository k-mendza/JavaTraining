package Udemy.CompleteJavaMasterclass.Polymorphism;

public class StarWars extends Movie {
    public StarWars(){
        super("Star Wars");
    }
    @Override
    public String plot(){
        return "Imperium fighting rebels";
    }
}
