package Udemy.CompleteJavaMasterclass.OOP;

public class Classes {

    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        System.out.println(porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println(porsche.getModel());
    }
}
