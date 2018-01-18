package Udemy.CompleteJavaMasterclass.ExpressionsStatementsCodeBlocksAndMethods;

public class IfKeyword {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore(true, score, levelCompleted, bonus);

        calculateScore(true, 800, 5,100);
//        if (score < 5000 && score > 1000)  // score lower than 5000 but larger than 1000
//        {
//            System.out.println("Your score was less than 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }
//        if (gameOver) {
//            int finalScore = score + (levelComplited * bonus);  // variables declared inside are unavailable outside if
//            System.out.println("Your final score was " + finalScore);
//        }

    }
    // declaration of method calculate score derived form method main above
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {  // list of param.
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        else {
            return -1;
        }
    }

}
