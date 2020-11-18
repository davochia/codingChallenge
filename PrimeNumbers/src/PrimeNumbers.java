public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(isPrime(7));


        int count = 0;
        for (int i = 33; i <= 100; i++){
            if (isPrime(i)){
                count += 1;
                System.out.println(i + " is prime");
                if (count == 10){
                    System.out.println("Terminating loop");
                    break;
                }

            }
        }


        System.out.println("------------------------------------------");


        int sum = 0;
        int countVar = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i + " divisible by 3 and 5");
                countVar++;
                sum += i;
                if (countVar == 5){
                    System.out.println("Terminating loop");
                    break;
                }
            }
        }
        System.out.println("Sum: "+sum);
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            // (long) Math.sqr(2)
            if (n % i == 0){
                return false;
            }
        }return true;
    }
}
