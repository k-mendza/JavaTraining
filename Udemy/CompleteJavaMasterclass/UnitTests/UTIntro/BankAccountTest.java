package Udemy.CompleteJavaMasterclass.UnitTests.Banking;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;
    private static int count;

    @org.junit.jupiter.api.BeforeAll
    public static void beforeAll(){
        System.out.println("Start of the tests. Count = " + count++);
    }

    @org.junit.jupiter.api.BeforeEach
    public void setup(){
        account = new BankAccount("Kar", "Men", 1000.0, BankAccount.CHECKING);
        System.out.println("Running test...");
    }

    @org.junit.jupiter.api.Test
    void deposit() {
        double balance = account.deposit(200.00, true);
        assertEquals(1200.00, balance); // compare account balance with expected value an tolerance 0
    }

    @org.junit.jupiter.api.Test
    void withdrawBranch() throws Exception{
        double balance = account.withdraw(600.00, true);
        assertEquals(400.00, balance);
    }

    @org.junit.jupiter.api.Test()
    void withdrawNotBranch(){
        assertThrows(IllegalArgumentException.class,()->{
            double balance = account.withdraw(600.00, false);
        });
    }

    @org.junit.jupiter.api.Test
    void getBalance_deposit() {
        account.deposit(200.00, true);
        assertEquals(1200.00, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    void getBalance_withdraw() {
        account.withdraw(200.00, true);
        assertEquals(800.00, account.getBalance());
    }

    @org.junit.jupiter.api.Test
    public void isCheckingTrue(){
        assertTrue(account.isChecking());
    }

    @org.junit.jupiter.api.AfterAll
    public static void  afterClass(){
        System.out.println("End of the tests. Test count = " + count++);
    }

    @AfterEach
    public void teardown(){
        System.out.println("Count = " + count++);
    }
}
