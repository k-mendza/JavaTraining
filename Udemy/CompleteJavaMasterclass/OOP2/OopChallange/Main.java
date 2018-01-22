package Udemy.CompleteJavaMasterclass.OopChallange;

public class Main {
    public static void main(String[] args){
        BasicBurger burger = new BasicBurger("normal","tasty",2.0);
        System.out.println(burger.getPrice());
        burger.setDoubleCheese(true,0.25);
        System.out.println(burger.getPrice());
        burger.setDoubleMeat(true, 1.0);
        System.out.println(burger.getPrice());
        burger.setSpicySouce(true, 0.1);
        System.out.println(burger.getPrice());

        HealthyBurger hBurger = new HealthyBurger("cow meat",2.5);
        System.out.println(hBurger.getPrice());
        hBurger.setDoubleCheese(true,0.25);
        System.out.println(hBurger.getPrice());

        DeluxeBurger dBurger = new DeluxeBurger("deluxe bread", "deluxe meat", 2.99);
        System.out.println(dBurger.getPrice());
    }
}
