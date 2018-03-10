package udemy.completeJavaMasterclass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    private static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
	    // Set ensures that there is no duplicates
        // there is no way to get value from set
        // sets are very fast

        HeavenlyBody temp = new HeavenlyBody("Mercury", 88);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Venus", 225);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        temp = new HeavenlyBody("Earth", 365);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27);
        solarSystem.put(tempMoon.getName(), tempMoon);
        temp.addMoon(tempMoon);

        temp = new HeavenlyBody("Pluto", 248);
        solarSystem.put(temp.getName(), temp);
        planets.add(temp);

        System.out.println("Planets");
        for (HeavenlyBody planet : planets){
            System.out.println("\t" + planet.getName());
        }
        HeavenlyBody body = solarSystem.get("Earth");
        System.out.println("Moons of " + body.getName());
        for (HeavenlyBody moon : body.getSatellites()){
            System.out.println("\t" + moon.getName());
        }

        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842);
        planets.add(pluto);

        for (HeavenlyBody planet : planets){
            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
        }
        /**
         * HashSet and HashMap store values with the same hashcodes in the same buckets.
         * It is possible then to use method equals() when looking for duplicates to check wrong bucket
         * and not see the right value. If 2 records have are the same they have to have the same hashcode
         */

        Object o = new Object();
        System.out.println(o.equals(o));
        System.out.println("pluto".equals("pluto"));
    }
}
