public class CommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(1010, -10));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int highNum = 0;
        int divisor = 1;
        while (first > divisor){

            if ((first  % divisor == 0 && second % divisor == 0) && divisor > highNum){
                highNum = divisor;
            }
            divisor++;
        }
        return highNum;
    }
}
