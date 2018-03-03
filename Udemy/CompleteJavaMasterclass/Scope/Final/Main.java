package udemy.completeJavaMasterclass;

public class Main {

    public static void main(String[] args) {
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");

        System.out.println(one.getInstNumber());
        System.out.println(two.getInstNumber());

        // can not assign value to final variable
        //one.instNumber = 4;
        System.out.println(Math.PI);

        /**
         * Cannot create instance of Math - constructor is private
         * also class itself is final so no inheritance allowed
         */
       // Math m = new Math();

        int pw = 676320;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(0);
        password.letMeIn(-20);
        password.letMeIn(676320);
    }
}
