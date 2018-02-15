package Udemy.CompleteJavaMasterclass.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	    String string = "I am a String. Yes I am.";
        System.out.println(string);
        // now the regular expression:
        String yourString = string.replaceAll("I","You");
        System.out.println(yourString);

        String alphanumeric = "abcDeeeF1234jjasdsajglkds0043jk";
        System.out.println(alphanumeric.replaceAll(".","Y")); // "." stands for every character
        System.out.println(alphanumeric.replaceAll("^abcDee", "YYY")); // replacement can be different length

        String secondString = "abcDeeeF1234jjasdsaabcDeeejglkds0043jk";
        System.out.println(secondString.replaceAll("^abcDee", "YYY")); // replaces only first chain because of ^

        System.out.println(alphanumeric.matches("^hello"));
        System.out.println(alphanumeric.matches("^abcDeee")); // entire String must match the parameter to return true
        System.out.println(alphanumeric.matches("abcDeeeF1234jjasdsajglkds0043jk"));

        System.out.println(alphanumeric.replaceAll("0043jk$","The END"));
        System.out.println(alphanumeric.replaceAll("[abce]", "X"));
        System.out.println(alphanumeric.replaceAll("[j][a]","X"));

        System.out.println("harry".replaceAll("[Hh]arry", "Harry"));
        System.out.println("Harry".replaceAll("[Hh]arry", "harry"));
        System.out.println(alphanumeric.replaceAll("[^ej]","X"));
        System.out.println(alphanumeric.replaceAll("[abcdef345678]", "X"));
        System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "X")); // specifying ranges to obtain same results
        System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // special modifier to omit letter size
        System.out.println(alphanumeric.replaceAll("[0-9]", "X"));

        String hasWhitespace = "I have blanks and\ta tab, and also new line\n";
        System.out.println(hasWhitespace);
        System.out.println(hasWhitespace.replaceAll("\\s", ""));
        System.out.println(hasWhitespace.replaceAll("\t", "X"));
        System.out.println(hasWhitespace.replaceAll("\\S",""));
        System.out.println(hasWhitespace.replaceAll("\\w","X"));
        System.out.println(hasWhitespace.replaceAll("\\W","X"));

        String a = "abcDeefghhiiiiiijklmnoprstuwxyz1234567890";
        System.out.println(a.replaceAll("^abcDe{3}", "YYY"));
        System.out.println(a.replaceAll("^abcDe+", "YYY"));
        System.out.println(a.replaceAll("abcDe*", "YYY")); // replace regardless of "e"
        System.out.println(a.replaceAll("^abcDe{2,5}", "XXX")); // replace with X if there between 2 to 5
        System.out.println(a.replaceAll("h+i*j","Y"));

        StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
        htmlText.append("<h2>Sub-heading</h2>");
        htmlText.append("<p>This is a paragraph</p>");
        htmlText.append("<p>This is another paragraph</p>");
        htmlText.append("<h2>Summary</h2>");
        htmlText.append("<p>Here is the summary</p>");

        String h2Pattern = "<h2>"; // . means any character and * means any number
        Pattern pattern = Pattern.compile(h2Pattern);
        Matcher matcher = pattern.matcher(htmlText);
        System.out.println(matcher.matches());

        matcher.reset();
        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end() );
        }

        String h2GroupPattern = "(<h2>.*?</h2>)";
        Pattern groupPattern = Pattern.compile(h2GroupPattern);
        Matcher groupMatcher = groupPattern.matcher(htmlText);
        System.out.println(groupMatcher.matches());
        groupMatcher.reset();

        while (groupMatcher.find()){
            System.out.println("Occurrence " + groupMatcher.group(1));
        }

        String h2TextGroups = "(<h2>)(.+?)(</h2>)";
        Pattern h2TextPattern = Pattern.compile(h2TextGroups);
        Matcher h2TextMatcher = h2TextPattern.matcher(htmlText);

        while (h2TextMatcher.find()){
            System.out.println("Occurrence " + h2TextMatcher.group(2));
        }

        String newString = "Harry";
        System.out.println(newString.replaceAll("[H|h]arry", "Larry")); // consider H or h as match

        String tvTest = "tstvtkt";
        //String tNotRegExp = "t[^v]";
        String tNotRegExp = "t(?!v)";
        Pattern tNotVPattern = Pattern.compile(tNotRegExp);
        Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);

        count = 0;
        while (tNotVMatcher.find()){
            count++;
            System.out.println("Occurrence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
        }

        String phone1 = "123456789";
        String phone2 = "(123) 456-7890";
        String phone3 = "123 456-7890";
        String phone4 = "(123)456-7890";

        System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
        System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
    }
}























































