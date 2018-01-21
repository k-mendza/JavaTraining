package Udemy.CompleteJavaMasterclass.Challenge;

public class Challenge {
    public static void main(String[] args){
        Audi tt = new Audi(1,200,"1","Audi");
        tt.quattroDrive();  // method form Audi class
        tt.changeGears();  // method form Car class
        tt.move(5); // method from Vehicle class
    }
}
