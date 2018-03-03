package udemy.completeJavaMasterclass;

public class SomeClass {

    private static int classCounter = 0;
    public final int instNumber;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instNumber = classCounter;
        System.out.println(name + " has been created. Instance number is: " + instNumber);
    }

    public int getInstNumber() {
        return instNumber;
    }
}
