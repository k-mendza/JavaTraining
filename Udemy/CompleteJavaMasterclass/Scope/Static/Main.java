package udemy.completeJavaMasterclass;

public class Main {

    public static int multi;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st inst");
//        System.out.println(firstInstance.getName() + " is instance number " + firstInstance.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("2nd inst");
//        System.out.println(secondInstance.getName() + " is instance number " + secondInstance.getNumInstance());

        int ans = multiply(6);
        System.out.println("ans: " + ans);
        System.out.println("multi: " + multi);
    }

    public static int multiply(int number){
        return number * multi;
    }
}
