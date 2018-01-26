package Udemy.CompleteJavaMasterclass.Arrays.AutoBoxingChallange;

public class Main
{
    public static void main(String[] args){
        Bank bank = new Bank("PKO S.A.");
        bank.addBranch("Warsaw");
        bank.addCustomer("Warsaw","Kr", 50.5);
        bank.addCustomer("Warsaw","Rdo", 150.5);
        bank.addCustomer("Warsaw","W", 250.5);
        bank.addCustomer("Warsaw","o", 350.5);
        bank.addBranch("Cracow");
        bank.addCustomer("Cracow","Kz", 50.5);
        bank.addCustomer("Cracow","Pz", 150.5);
        bank.addCustomer("Cracow","Ox", 250.5);
        bank.addCustomer("Cracow","Ox", 250.5);
        bank.addCustomer("Cracow","Ox", 250.5);
        bank.addCustomer("Cracow","Oy", 350.5);

        bank.listCustomers("Cracow", true);

    }
}
