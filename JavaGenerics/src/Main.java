public class Main {
    public static void main(String[] args) {
        FootballPlayer dav = new FootballPlayer("Dav");
        BasketballPlayer och = new BasketballPlayer("och");

        Team<FootballPlayer> barcelona = new Team("Barcelona");
        barcelona.addPlayer(dav);

        Team<FootballPlayer> arsenal = new Team("Arsenal");

        barcelona.matchResult(arsenal, 5, 3);

    }
}
