package udemy.completeJavaMasterclass;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Och", 8, 12);
	    if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry seat is taken");
        }
        if (theatre.reserveSeat("H11")){
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry seat is taken");
        }
    }
}