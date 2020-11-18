public class NumberToWord {
    public static void main(String[] args){
        numberToWords(0);
        //System.out.println(reverse(-123));
        //System.out.println(getDigitCount(-2365));
    }

    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
        }
        int count = getDigitCount(number);
        number = reverse(number);

        //System.out.println(number);

        //System.out.println(count);

        while (number > 0 || count > 0){

            int remN = number % 10;
            number /= 10;
            count--;

            switch (remN){
                case 0:
                    System.out.println("Zero");
                    break;

                case 1:
                    System.out.println("One");
                    break;

                case 2:
                    System.out.println("Two");
                    break;

                case 3:
                    System.out.println("Three");
                    break;

                case 4:
                    System.out.println("Four");
                    break;

                case 5:
                    System.out.println("Five");
                    break;

                case 6:
                    System.out.println("Six");
                    break;

                case 7:
                    System.out.println("Seven");
                    break;

                case 8:
                    System.out.println("Eight");
                    break;

                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    System.out.println("Invalid Value");
                    break;
            }
        }
    }

    public static int reverse(int number){
//        if (number < 1){
//            return number;
//        }
        int reverse = 0;
        while (number != 0){
            int temNum = number % 10;
            reverse = reverse * 10 + temNum;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }else if (number == 0){
            return 1;
        }
        int count = 0;
        while (number > 0 ){

            number /= 10;
            count++;

        }
        return count;
    }
}
