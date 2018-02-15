package Udemy.CompleteJavaMasterclass.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Challenge {
    public static void main(String[] args){

        String challenge1 = "I want a bike.";
        String challenge2 = "I want a ball.";
        System.out.println(challenge1.matches("I want a bike."));
        System.out.println(challenge1.matches("I want a \\w+.")); // w stands for all characters a-z and 0-9
        System.out.println(challenge2.matches("I want a (bike|ball)."));

        String regExp = "I want a \\w+.";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(challenge1);
        System.out.println(matcher.matches());
        pattern.matcher(challenge2);
        System.out.println(matcher.matches());

        String challenge4 = "Replace all blanks with underscores.";
        System.out.println(challenge4.replaceAll(" ", "_"));

        String challenge5 = "aaabccccccccdddefffg";
        System.out.println(challenge5.matches("[a-g]+"));

        System.out.println(challenge5.matches("^a{3}bc{8}d{3}ef{3}g$"));

        String challenge7 = "abcd.123";
        System.out.println(challenge7.matches("^[A-z][a-z]+\\.\\d+$"));
    }
}
