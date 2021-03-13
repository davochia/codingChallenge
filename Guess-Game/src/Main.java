import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();


        System.out.println("Welcome!!!");
        System.out.println("What's your name?");

        String playerName = sc.next();
        System.out.println("Hi " + playerName);

        System.out.println("Start game?  1 to start or 2 to ignore");
        int startGame = sc.nextInt();

        while (startGame != 1){
            System.out.println("Start game?  1 to start or 2 to ignore");
            startGame = sc.nextInt();
        }

        int compNum = rand.nextInt(10) + 1;
        System.out.println("Guess the number! between 0 to 10");
        int guessNum = sc.nextInt();
        int tryTimes = 0;
        boolean won = false;
        boolean finished = false;

        while (!finished){
            tryTimes ++;
            if (tryTimes < 5){
                if (guessNum == compNum){
                    won = true;
                    finished = true;
                } else if (guessNum < compNum){
                    System.out.println("Guess upper!");
                    guessNum = sc.nextInt();
                }else if (guessNum > compNum){
                    System.out.println("Guess lower!");
                    guessNum = sc.nextInt();
                }
            }else {
                finished = true;
            }
        }


        if (won){
            System.out.println("You won!!!" + " Computer number: "+compNum + " Your number: "+ guessNum);
        }else {
            System.out.println("You loose!"+ " Computer number: "+ compNum + " Try times: "+ tryTimes);
        }
    }
}
