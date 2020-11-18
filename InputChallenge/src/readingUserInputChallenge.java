import java.util.Scanner;

public class readingUserInputChallenge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
//        while (count <= 10) {
//            System.out.print("Enter #" + count + ": ");
//            boolean hasNextInt = sc.hasNextInt();
//            int num = sc.nextInt();
//
//            if (hasNextInt){
//                sum += num;
//            } else System.out.println("Invalid Number");
//            count++;
//        }

        while (true){
            int position = count + 1;
            System.out.println("Enter number #" + position + ":");

            boolean isInt = sc.hasNextInt();
            if (isInt){
                int num = sc.nextInt();
                count++;
                sum += num;
                if (count == 10){
                    break;
                }
            }else System.out.println("Invalid number");

            sc.nextLine(); // Handle enter key end of line
        }
        System.out.println("Sum: "+ sum);
        sc.close();
    }
}
