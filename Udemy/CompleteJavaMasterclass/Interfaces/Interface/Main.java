package Udemy.CompleteJavaMasterclass.Interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone phone;
        phone = new DeskPhone(123456789);
        phone.powerOn();
        phone.callPhone(123456789);
        phone.answer();
        phone = new MobilePhone(321654987);
        phone.powerOn();
        phone.callPhone(321654987);
        phone.answer();
    }
}
