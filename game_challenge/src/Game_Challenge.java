public class Game_Challenge {
    //int scorePosition;
    public static void displayHighScorePosition(String name, int scorePosition){
        System.out.println(name + " manage to get into " + scorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score > 1000){
            return 1;
        }else if(score < 1000 && score > 500){
            return 2;
        }else if (score < 500 && score > 100){
            return 3;
        }else {
            return 4;
        }
    }

    public static void main(String[] args) {
        Game_Challenge newGame1 = new Game_Challenge();

        int newGame2 = calculateHighScorePosition(1500);
        //System.out.println(newGame2);
        displayHighScorePosition("Mark", newGame2);
    }
}
