public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0;
        int num = number;

        while(num != 0){
            int intNum = num % 10;
            reverse = reverse * 10 + intNum;
            num /= 10;
        }
        System.out.println(number);
        System.out.println(reverse);
        if (reverse == number){
            return true;
        }else{
            return false;
        }
    }
}
