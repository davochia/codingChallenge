public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(19));
        System.out.println("Sum digit: " + sumDigits(4456));


        int number = 4;
        int finishNumber = 20;
        int count = 0;
        int sum = 0;
        while(number <= finishNumber){
            number++;
            if (!isEven(number)){
                continue;
            }
            if (count == 5){
                break;
            }
            System.out.println("Even number: "+ number);
            sum += number;
            count++;
        }
        System.out.println("Even number sum: "+sum);
        System.out.println("Total even number: "+count);


    }

    public static boolean isEven(int num){
        if (num < 0){
            return false;
        }else if (num % 2 == 0){
            return true;
        }
        return false;
    }


    public static int sumDigits(int num){
        if (num < 10){
            return -1;
        }
        int sum = 0;
        while(num > 0){

            /*
            int intNum = num % 10; //extract the least-significant value
            sum += intNum; // sum the least-significant value
            num /= 10; //drop the least significant value
             */



            int intNum = num /10;
            int remNum = num % 10;

            sum += remNum;
            num = intNum;
        }
        return sum;
    }
}
