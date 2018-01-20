package Udemy.CompleteJavaMasterclass.OOP;

public class Main
{
    public static void main(String[] args){
//        Account karAcc = new Account("123456789",0.00,"Karo Maro", "myemail@email.com", "555555777");
//        karAcc.deposit(1000);
//        karAcc.withdrawal(900);
//        karAcc.withdrawal(150);
        VipPerson pers1 = new VipPerson();
        System.out.println(pers1.getName());

        VipPerson pers2 = new VipPerson("Karo", 25000, "myemail@email.com");
        System.out.println(pers2.getName());

        VipPerson pers3 = new VipPerson("Tim", 100);
        System.out.println(pers3.getEmailAdress());
    }
}
