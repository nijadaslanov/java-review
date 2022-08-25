public class TeamTest {
    public static void main(String[] args) {

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        // Team liverpool = new Team("Liverpool");

        Team<FootballPlayer> liverpool = new Team<>("Liverpool");

       //Team<String> brokenTeam = new Team<>("this wont work");
       // brokenTeam.addPlayer("nijad");


        liverpool.addPlayer(joe);
        System.out.println(liverpool.numPlayer());
        //liverpool.addPlayer(pat);
        //liverpool.addPlayer(beckham);
       // System.out.println(brokenTeam);


    }
}
