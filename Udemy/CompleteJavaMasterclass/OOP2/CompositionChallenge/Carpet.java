package Udemy.CompleteJavaMasterclass.CompositionChallenge;

public class Carpet {
    private int length;
    private int width;
    private String color;
    private String model;

    public int getLength() {
        System.out.println("The length is " + this.length);
        return length;
    }

    public int getWidth() {
        System.out.println("The width is " + this.width);
        return width;
    }

    public String getModel() {
        System.out.println("The model is " + this.model);
        return model;
    }

    public String getColor() {
        System.out.println("The model is " + this.color);
        return color;
    }



    public Carpet(int length, int width, String color, String model) {

        this.length = length;
        this.width = width;
        this.color = color;
        this.model = model;
    }
}
