import java.util.Scanner;

public class SumAveragePrint {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true){
            //System.out.print("Enter number: ");
            boolean isInt = sc.hasNextInt();

            if (isInt){
                int num = sc.nextInt();
                sum += num;
                count++;
            }
            else {
                break;
            }
            sc.nextLine();
        }

//        System.out.println("Count: " + count);
//        System.out.println("Sum: " + sum);

        int avg = (int)(Math.round((double)sum/count));

        System.out.println("SUM = " + sum + " AVG = " + avg);
        sc.close();
    }
}
