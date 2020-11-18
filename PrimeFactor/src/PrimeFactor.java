public class PrimeFactor {
    public static void main(String[] args) {
        primeFactors(6);
        System.out.println(isPerfectNumber(28));
    }

    public static void primeFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        int divisor = 1;
        while(number >= divisor){
            if (number % divisor == 0)
            {
                System.out.println(divisor);
            }
            divisor++;
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        int divisor = 1;

        while(number > divisor){
            if (number % divisor == 0){
                sum += divisor;
            }

            divisor++;
        }

        System.out.println(sum);

        if (sum == number){
            return true;
        }
        else {
            return false;
        }
    }
}
