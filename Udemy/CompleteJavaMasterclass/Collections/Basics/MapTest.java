package udemy.completeJavaMasterclass;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {

        Map<String,  String> languages = new HashMap<>();
        languages.put("Java", "a compiled high level, platform independent");
        languages.put("Python", "an interpreted, object oriented high level");
        languages.put("C++", "a compiled fast, high level, object orientated");

        System.out.println(languages.get("Java"));

        // check if the key is already in the HashMap
        if (languages.containsKey("Java")){
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "overridden");
        }
        System.out.println(languages.get("Java"));

        System.out.println("====================");

        for (String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
