package Udemy.CompleteJavaMasterclass.OopChallange;

public class BasicBurger {
    private String breadRollType;
    private String meat;
    private boolean doubleCheese;
    private boolean doubleMeat;
    private boolean onion;
    private boolean spicySouce;
    private double price;

    public BasicBurger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
        this.doubleCheese = false;
        this.doubleMeat = false;
        this.onion = false;
        this.spicySouce = false;
    }

    public void setBreadRollType(String breadRollType) {
        this.breadRollType = breadRollType;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public void setDoubleCheese(boolean doubleCheese, double price) {
        if (doubleCheese = true) {
            this.price += price;
            this.doubleCheese = doubleCheese;
        }
    }

    public void setDoubleMeat(boolean doubleMeat, double price) {
        if (doubleMeat = true) {
            this.price += price;
            this.doubleMeat = doubleMeat;
        }

    }

    public void setOnion(boolean onion, double price) {
        if (onion = true) {
            this.price += price;
            this.onion = onion;
        }

    }

    public void setSpicySouce(boolean spicySouce, double price) {
        if (spicySouce = true) {
            this.price += price;
            this.spicySouce = spicySouce;
        }

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than zero");
        }

    }
}
