package Udemy.CompleteJavaMasterclass.OopChallange;

public class HealthyBurger extends BasicBurger{
    private boolean lettuce;
    private boolean tomato;

    public HealthyBurger(String meat, double price) {
        super("Brown Rye Bread Roll", meat, price);
    }

    public void setLettuce(boolean lettuce, double price) {
        if (lettuce = true){
            this.setPrice(this.getPrice() + price);
            this.lettuce = lettuce;
        }
    }

    public void setTomato(boolean tomato, double price) {
        if (tomato = true){
            this.setPrice(this.getPrice() + price);
            this.tomato = tomato;
        }
    }
}
