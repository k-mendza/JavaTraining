package Udemy.CompleteJavaMasterclass.Generics;

import java.util.ArrayList;

public class Main {

    // generics accept
    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        items.add(6);
//        // items.add("int");
//
//        printDoubled(items);
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer ronaldo = new SoccerPlayer("Ronaldo");
        // team will accept all players!
        Team<FootballPlayer> myTeam = new Team<>("Football Team");
        myTeam.addPlayer(joe);
//        myTeam.addPlayer(pat);
//        myTeam.addPlayer(ronaldo);

        System.out.println(myTeam.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Baseball team");
        baseballTeam.addPlayer(pat);

        Team<FootballPlayer> notMyTeam = new Team<>("Not my team");

        myTeam.matchResult(notMyTeam , 3, 0);

    }
//    private static void printDoubled(ArrayList<Integer> n){
//        for (Object i : n){
//            System.out.println((Integer) i*2);
//        }
//    }
}
