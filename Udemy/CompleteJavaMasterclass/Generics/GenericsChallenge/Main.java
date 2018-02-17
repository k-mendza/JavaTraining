package Udemy.CompleteJavaMasterclass.GenericsChallenge;

public class Main {
    public static void main(String[] args){

        League<Team<FootballPlayer>> footBallLeague = new League<>("Champions League");
        Team<FootballPlayer> team1 = new Team<>("Team 1");
        Team<FootballPlayer> team2 = new Team<>("Team 2");
        Team<FootballPlayer> team3 = new Team<>("Team 3");
        Team<FootballPlayer> team4 = new Team<>("Team 4");
        footBallLeague.add(team1);
        footBallLeague.add(team2);
        footBallLeague.add(team3);
        footBallLeague.add(team4);

        team1.matchResult(team2, 1, 0);
        team3.matchResult(team4, 2, 1);
        footBallLeague.showLeagueTable();
    }
}
