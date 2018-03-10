package udemy.completeJavaMasterclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> plantes = new HashSet<>();

    public static void main(String[] args) {
	    // Set ensures that there is no duplicates
        // there is no way to get value from set
        // sets are very fast

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        plantes.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        plantes.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        plantes.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        System.out.println("Planets");
        for (HeavenlyBody planet : plantes){
            System.out.println("\t" + planet.getName());
        }
        HeavenlyBody body = solarSystem.get("Venus");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody moon : body.getSatellites()){
            System.out.println("\t" + moon.getName());
        }
    }
}
