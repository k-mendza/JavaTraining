package Udemy.CompleteJavaMasterclass.CompositionChallenge;

public class Room
{
    private Bed theBed;
    private Desk theDesk;
    private Closet theCloset;
    private Carpet theCarpet;

    public Room(Bed theBed, Desk theDesk, Closet theCloset, Carpet theCarpet) {
        this.theBed = theBed;
        this.theDesk = theDesk;
        this.theCloset = theCloset;
        this.theCarpet = theCarpet;
    }
    public void description(){
        System.out.println(theBed.getHeight());
        System.out.println(this.theDesk.getLength());
        System.out.println(this.theCloset.getModel());
        System.out.println(this.theCarpet.getWidth());
    }

}
