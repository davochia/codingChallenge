public class OddNumbers {
    public static void main(String[] args) {
        System.out.println(isOdd(6));
        System.out.println(sumOdd(100,10));
    }

    public static boolean isOdd(int num){
        if (num < 1){
            return false;
        }
        else if (num % 2 == 0){
            return false;
        }else {
            return true;
        }

    }

    public static int sumOdd(int start, int end){
        if ((start < 1 || end < 1) || !(end >= start)) {
            return -1;
        }else {
            int sum = 0;
            for (int i = start; i <= end; i++){
                if (isOdd(i)){
                    sum += i;
                }
            }
            return sum;
        }
    }
}
