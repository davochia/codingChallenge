public class LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(16));

    }

    public static int getLargestPrime(int number){
        if (number <= 1){
            return -1;
        }
        int largePrime = 0;

        for(int i = 2; i<= number; i++) {
            while(number % i == 0) {
                if (i > largePrime){
                    largePrime = i;
                }
                number = number/i;
            }
        }
        return largePrime;
    }
}
