package udemy.completeJavaMasterclass.scope;

public class Main {

    public static void main(String[] args) {

	    String privateVar = "this is private to main()";
	    ScopeCheck scopeInstance = new ScopeCheck();
	    scopeInstance.useInner();
	    ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " /*+ innerClass.varThree*/);
//        System.out.println("scopeInstance varThree is " + scopeInstance.getVarOne());
//        System.out.println(privateVar);
//        scopeInstance.timesTwo();
//        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//        innerClass.timesTwo();
    }
}
