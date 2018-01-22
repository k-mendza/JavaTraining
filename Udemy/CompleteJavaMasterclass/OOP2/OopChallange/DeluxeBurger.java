package Udemy.CompleteJavaMasterclass.OopChallange;

public class DeluxeBurger extends BasicBurger {
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
        this.chips = true;
        this.setPrice(this.getPrice() + 0.8);
        this.drinks = true;
        this.setPrice(this.getPrice() + 0.69);
    }
}
