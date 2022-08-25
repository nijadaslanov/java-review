import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private ArrayList<T> members = new ArrayList();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            // no need to cast anymore since T extends Player
            System.out.println(player.getName() + "is already in this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }

    }


    public int numPlayer() {
        return this.members.size();
    }
}