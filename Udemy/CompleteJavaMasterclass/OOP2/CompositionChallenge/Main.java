package Udemy.CompleteJavaMasterclass.CompositionChallenge;

public class Main {
    public static void main(String[] args){
        Desk theDesk = new Desk(10,5,7,"Nice One");
        Closet theCloset = new Closet(50,50,150,"Closet 500");
        Carpet theCarpet = new Carpet(150,150,"brown", "Persian dream");
        Bed theBed = new Bed(250,50,50,"relax 150");
        Room theRoom = new Room(theBed,theDesk,theCloset,theCarpet);
        theRoom.description();

    }
}
