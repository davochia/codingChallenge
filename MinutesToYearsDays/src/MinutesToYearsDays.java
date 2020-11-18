public class MinutesToYearsDays {
    public static void main(String[] args) {
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid value");
        }else{
            long yr = minutes / 525600;
            long d = (minutes % 525600)/1440;

            System.out.println(minutes + " min = " + yr + "y and " + d + "d");
        }
    }
}
