public class LeapYearTwo {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(-2000));
        System.out.println(isLeapYear(9000));
        System.out.println(isLeapYear(-1024));
        System.out.println(isLeapYear(1924));

        System.out.println("-------------------------------------------------------");

        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

    }

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

    public static int getDaysInMonth(int month, int year) {


        if (!(month < 1 || month > 12) && !(year < 1 || year > 9999)) {
            if (isLeapYear(year)) {
                if (month == 2) {
                    return 29;
                }else if (month == 4 || month == 6 || month == 9 || month == 11){
                    return 30;
                } else {
                    return 31;
                }
            } else if (!isLeapYear(year)) {
                if(month == 4 || month == 6 || month == 9 || month == 11){
                    return 30;
                }else if (month == 2){
                    return 28;
                }else {
                    return 31;
                }
            }else {
                return -1;
            }
        }else{
            return -1;
        }
    }
}
