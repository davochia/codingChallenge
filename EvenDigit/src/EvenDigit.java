public class EvenDigit {
    public static void main(String[] args) {
        System.out.println(evenDigitSum(2135468));
    }
    public static int evenDigitSum(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        }
        while (number > 0){
            int intNum = number / 10;
            int remNum = number % 10;
            number = intNum;
            //System.out.println(remNum);
            if (remNum % 2 == 0){
                sum += remNum;
            }else {
                sum += 0;
            }
        }
        return sum;
    }
}
