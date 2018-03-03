package udemy.completeJavaMasterclass;

public class Password {
    public static final int key = 123578543;
    private final int encryptedPassword;

    public Password(int password) {
        this.encryptedPassword = encryptDecrypt(password);
    }

    private int encryptDecrypt(int pass){
        return pass ^ key;
    }

    public void storePassword() {
        System.out.println("Password saved as: " + this.encryptedPassword);
    }

    public boolean letMeIn(int password){
        if (encryptDecrypt(password) == this.encryptedPassword){
            System.out.println("Welcome");
            return true;
        } else {
            System.out.println("Invalid password");
            return false;
        }
    }
}
