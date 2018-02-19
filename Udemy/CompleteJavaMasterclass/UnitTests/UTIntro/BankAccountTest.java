package Udemy.CompleteJavaMasterclass.UnitTests.Banking;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @org.junit.jupiter.api.Test
    void deposit() {
        BankAccount account = new BankAccount("Kar", "Men", 1000.0, BankAccount.CHECKING);
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance); // compare account balance with expected value an tolerance 0
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("This test has to be implemented");
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        BankAccount account = new BankAccount("Kar", "Men", 1000.0, BankAccount.CHECKING);
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        BankAccount account = new BankAccount("Kar", "Men", 1000.0, BankAccount.CHECKING);
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    public void isCheckingTrue(){
        BankAccount account = new BankAccount("Kar", "Men", 1000.0, BankAccount.CHECKING);
        assertTrue(account.isChecking());
    }
    @org.junit.jupiter.api.Test
    public void isCheckingFalse(){
        BankAccount account = new BankAccount("Kar", "Men", 1000.0, BankAccount.SAVINGS);
        assertFalse(account.isChecking());
    }
}
