package udemy.completeJavaMasterclass;

public class StaticTest {
    // static field is the same for all instances of the class
    private static int numInstance = 0;
    private String name;

    public StaticTest(String name){
        this.name = name;
        numInstance++;
    }

    public int getNumInstance() {
        return numInstance;
    }

    public String getName() {
        return name;
    }
}
