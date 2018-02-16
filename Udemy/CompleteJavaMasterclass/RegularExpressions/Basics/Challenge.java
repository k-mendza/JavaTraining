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

        String challenge8 = "abcd.1235uvqz.7tzik.999";
        Pattern pattern2 = Pattern.compile("[A-z][a-z]+\\.(\\d+)");
        Matcher matcher2 = pattern2.matcher(challenge8);
        while (matcher2.find()){
            System.out.println("Occurrence " + matcher2.group(1));
        }

        String challenge9 = "abcd.1235\tuvqz.7\ttzik.999\n";
        Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher9 = pattern2.matcher(challenge9);
        while (matcher9.find()){
            System.out.println("Occurrence " + matcher9.group(1));
        }

        String challenge10 = "abcd.1235\tuvqz.7\ttzik.999\n";
        Pattern pattern10 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
        Matcher matcher10 = pattern2.matcher(challenge10);
        while (matcher10.find()){
            System.out.println("Occurrence start = " + matcher10.start(1) + " end = " + (matcher10.end(1)-1));
        }

        String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
        Pattern pattern11 = Pattern.compile("\\{(.+?)\\}");
        Matcher matcher11 = pattern11.matcher(challenge11);
        while (matcher11.find()){
            System.out.println("Occurrence " + matcher11.group(1));
        }
    }
}
