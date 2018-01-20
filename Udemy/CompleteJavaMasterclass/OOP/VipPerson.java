package Udemy.CompleteJavaMasterclass.OOP;

public class VipPerson
{
    private String name;
    private double creditLimir;
    private String emailAdress;

    public VipPerson() {
        this("Default name", 50000, "defaultemail");
    }

    public VipPerson(String name, double creditLimir, String emailAdress) {
        this.name = name;
        this.creditLimir = creditLimir;
        this.emailAdress = emailAdress;
    }

    public VipPerson(String name, double creditLimir) {
        this.name = name;
        this.creditLimir = creditLimir;
        this.emailAdress = "default";
    }

    public String getName() {
        return name;
    }

    public double getCreditLimir() {
        return creditLimir;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
