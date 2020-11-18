import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

                        // Alternatively
        int maxNum = 0; //Integer.MAX_VALUE;
        int minNum = 0; // Integer.MIN_VALUE;
        boolean first = true;

        while (true){
            System.out.print("Enter number: ");
            boolean isInt = sc.hasNextInt();

            if (isInt){
                int num = sc.nextInt();

                if (first){
                    first = false;
                    maxNum = num;
                    minNum = num;
                }
                if (num > maxNum){
                    maxNum = num;

                }
                if (num < minNum){
                    minNum = num;
                }

            }else break;

            sc.nextLine();

        }
        System.out.println("Max: " + maxNum);
        System.out.println("Min: " + minNum);
        sc.close();
    }
}
