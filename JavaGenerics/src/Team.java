import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>>{
    String name;
    int won = 0;
    int lost = 0;
    int played = 0;
    int tied = 0;

    private List<T> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if (players.contains(player)){
            System.out.println(player.getPlayerName() + " is already on this team");
            return false;
        }else{
            players.add(player);
            System.out.println(player.getPlayerName() + " was added to team " + this.name);
            return true;
        }
    }

    public int numPlayers(){
        return this.players.size();
    }


    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String message;
        if (ourScore > theirScore){
            won++;
            message = " beat ";
        }else if(ourScore == theirScore){
            tied++;
            message = " drew with ";
        }else{
            lost++;
            message = " lost to ";
        }
        played++;

        if (opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }


    @Override
    public int compareTo(Team<T> team) {
        if (this.ranking() > team.ranking()){
            return -1;
        }else if(this.ranking() < team.ranking()){
            return 1;
        }else{
        return 0;}
    }
}
