public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) {
           return false;
        }if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }else{
                    return false;
                }
            }
            return true;
        }
        else{return false;}
    }

    public static void main(String[] args) {
        boolean leapYear = LeapYearCalculator.isLeapYear(2000);
        System.out.println(leapYear);
    }
}
