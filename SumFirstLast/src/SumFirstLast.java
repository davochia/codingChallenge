public class SumFirstLast {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(-23123));

    }

    public static int sumFirstAndLastDigit(int number){
        int sum = 0;
        if (number < 0){
            return -1;
        }
        int lastNum = number % 10;
        while (number >= 10){
            number = number / 10;
        }
        sum = lastNum + number;
        return sum;
    }
}
