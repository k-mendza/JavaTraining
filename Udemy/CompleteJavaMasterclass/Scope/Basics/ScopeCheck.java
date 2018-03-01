package udemy.completeJavaMasterclass.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;

    public ScopeCheck() {
        System.out.println("ScopeCheck created, publicVar: " + publicVar + " privateVar: " + privateVar);
    }

    public int getPublicVar() {
        return publicVar;
    }

    public int getPrivateVar() {
        return privateVar;
    }

    public void timesTwo() {
        // this local privateVar will overwrite the global one
        int privateVar =2;
        // the value is tested in loop
        for (int i=0; i<10; i++){
            System.out.println(i + " x"+privateVar+" =" + (i*privateVar));
        }
        // to access the global variable use pointer this
        System.out.println("Global privateVar is: " + this.privateVar);
    }

    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("Inner class created, privateVar is: " + privateVar);
        }

        public void timesTwo() {
            System.out.println("This is call to innerClass method");
            // this local privateVar will overwrite the global one
            int privateVar = 3;
            // the value is tested in loop
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " x" + privateVar + " =" + (i * privateVar));
            }
            // to access the global variable use pointer this
            System.out.println("Global of outer class is now called: privateVar is: " + this.privateVar);
            System.out.println("Checking scope of privateVar: " + ScopeCheck.this.privateVar);
        }
    }
}
