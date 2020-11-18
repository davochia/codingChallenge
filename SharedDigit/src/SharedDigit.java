public class SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(94, 74));
    }

    public static boolean hasSharedDigit(int a, int b){

        if ((a < 10 || a > 99) || (b < 10 || b > 99)){
            return false;
        }

        while (a > 0 || b > 0){

            int remA = a % 10;
            int remB = b % 10;
            int intA = a / 10;
            int intB = b / 10;


            if (remA == remB || intA == intB || remA == intB || remA == intA){
                return true;
            }
            return false;

        }
        return true;
    }
}
