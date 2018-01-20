package Udemy.CompleteJavaMasterclass.OOP;

public class Account
{
    private String accountNumber;
    private double accountBalance;
    private String accountName;
    private String accountEmail;
    private String accountPhoneNumber;

    // in IDEA it is possible to create setters getters and constructors automaticall
    public Account(String accountName, String accountEmail, String accountPhoneNumber) {
        this.accountNumber = "9999";
        this.accountBalance = 0.0;
        this.accountName = accountName;
        this.accountEmail = accountEmail;
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public Account(){

        this("Default",0,"Default","Default","Default");
        System.out.println("Empty constructor call");
    }

    public Account(String accountNumber, double accountBalance, String accountName, String accountEmail,
                   String accountPhoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountName = accountName;
        this.accountEmail = accountEmail;
        this.accountPhoneNumber = accountPhoneNumber;
    }

    public void deposit(double depositAmount){
        this.accountBalance += depositAmount;
    }
    public void withdrawal(double withdrawalAmount){
        if (accountBalance - withdrawalAmount <= 0) {
            System.out.println("Only " + accountBalance + " available. Withdrawal denied");
        }else{
            this.accountBalance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + " was successfully processed");
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public String getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(String accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
    }
}
