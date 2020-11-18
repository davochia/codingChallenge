public class isLeapYearOne {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1999));
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
}
