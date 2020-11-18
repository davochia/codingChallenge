public class SameLastDigit {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(1, 243, 985));
    }

    public static boolean hasSameLastDigit(int a, int b, int c){
        if(!isValid(a) || !isValid(b) || !isValid(c)){
            return false;
        }

        while(a > 0 || b > 0 || c > 0){
            int remA = a % 10;
            int remB = b % 10;
            int remC = c % 10;

            if (remA == remB || remB == remC || remA == remC){
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean isValid(int num){
        if (num >= 10 && num <= 1000){
            return true;
        }
        return false;
    }
}
