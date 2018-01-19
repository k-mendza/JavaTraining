package Udemy.CompleteJavaMasterclass.ControlFlowStatements;

public class SwitchStatement {
    public static void main(String[] args) {
//        int intValue = 1;
//        if (intValue == 1)
//        {
//            System.out.println("Value was 1");
//        }
//        else if (intValue == 2)
//        {
//            System.out.println("Value was 2");
//        }
//        else
//        {
//            System.out.println("Value was not 1 ot 2");
//        }

        int switchValue = 1;
        // advantege of using switch instead of if is that you check the condition
        // only once and then deal with exact value
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Value was: " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
        }

        char switchCharVariable = 'A';

        switch (switchCharVariable) {
            case 'A':
                System.out.println("This is letter A");
                break;
            case 'B':
                System.out.println("This is letter B");
                break;
            case 'C':
                System.out.println("This is letter C");
                break;
            case 'D':
                System.out.println("This is letter D");
                break;
            case 'E':
                System.out.println("This is letter E");
                break;
            default:
                System.out.println("None of letters A, B, C, D, E were entered");
                break;
        }

        // Strings in switch were added in Java 7
        String month = "May";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("This is January");
                break;
            case "june":
                System.out.println("This is June");
                break;
            default:
                System.out.println("This month is not handled!");
                break;

        }

        System.out.println("End of main method");
    }
}
