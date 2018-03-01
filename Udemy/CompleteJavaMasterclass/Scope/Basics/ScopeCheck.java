package udemy.completeJavaMasterclass.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar: " + publicVar + " varOne: " + varOne);
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo() {
        // this local varOne will overwrite the global one
        int varTwo =2;
        // the value is tested in loop
        for (int i=0; i<10; i++){
            System.out.println(i + " x"+varTwo+" =" + (i*varTwo));
        }
        // to access the global variable use pointer this
        System.out.println("Global varOne is: " + this.varOne);
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree form outer class: " + innerClass.varThree);
    }

    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("Inner class created, varOne is: " + varOne + "and varThree is " + varThree);
        }

        public void timesTwo() {
            System.out.println("This is call to innerClass method");
            // this local varOne will overwrite the global one
            System.out.println("varOne is still available here");
            int privateVar = 3;
            // the value is tested in loop
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " x2 =" + (i * varThree));
            }
            // to access the global variable use pointer this
            System.out.println("Global of outer class is now called: varOne is: " + this.varThree);
            System.out.println("Checking scope of varOne: " + ScopeCheck.this.varOne);
        }
    }
}
