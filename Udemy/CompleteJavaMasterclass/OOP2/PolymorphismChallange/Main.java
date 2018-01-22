package Udemy.CompleteJavaMasterclass.PolymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda",2);
        car = randomCar();
        car.accelerate();
    }
    public static Car randomCar(){
        int randomNumber = (int) Math.random()*2+1;

        switch (randomNumber){
            case 1:
                return new Audi("TT",4);
            case 2:
                return new BMW("335i",6);
        }
        return null;
    }
}
