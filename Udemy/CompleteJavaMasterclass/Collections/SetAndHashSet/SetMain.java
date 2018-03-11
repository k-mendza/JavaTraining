package udemy.completeJavaMasterclass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();

        for (int i = 1; i<=100;i++){
            squares.add(i*i);
            cubes.add(i*i*i);
        }

        System.out.println("Size of squares: " + squares.size());
        System.out.println("Size of cubes: " + cubes.size());
        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Size of union: " + union.size());

        Set<Integer> intersection = new HashSet<>(squares);
        intersection.retainAll(cubes);
        System.out.println("Size of intersection: " + intersection.size());
        for (int i : intersection){
            System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube is " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "this is my sentence";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String w : words){
            System.out.println(w);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));
        
    }
}
