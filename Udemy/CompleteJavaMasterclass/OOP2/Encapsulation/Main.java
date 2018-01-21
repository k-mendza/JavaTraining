package Udemy.CompleteJavaMasterclass.Encapsulation;

public class Main {
    public static void main(String[] args){
//        Player player = new Player();
//        player.name = "Kar";
//        player.health = 20;
//        player.weapon = "bow";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//        damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
//        damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Kar", 50, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}
