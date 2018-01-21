package Udemy.CompleteJavaMasterclass.CompositionChallenge;

public class Bed {
    private int length;
    private int width;
    private int height;
    private String model;

    public Bed(int length, int width, int height, String model) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.model = model;
    }

    public int getLength() {
        System.out.println("The length is " + this.length);
        return length;
    }

    public int getWidth() {
        System.out.println("The width is " + this.width);
        return width;
    }

    public int getHeight() {
        System.out.println("The height is " + this.height);
        return height;
    }

    public String getModel() {
        System.out.println("The model is " + this.model);
        return model;
    }
}
