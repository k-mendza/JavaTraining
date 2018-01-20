package Udemy.CompleteJavaMasterclass.OOP;

public class Main
{
    public static void main(String[] args){
        Account karAcc = new Account("123456789",0.00,"Karo Maro", "myemail@email.com", "555555777");
        karAcc.deposit(1000);
        karAcc.withdrawal(900);
        karAcc.withdrawal(150);
    }
}
