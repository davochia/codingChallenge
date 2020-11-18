public class SecondsMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int min, int sec){

        // Check if seconds is less than 60, seconds and minutes not less than 0
        if (min < 0 || sec < 0 || sec > 59){
            return INVALID_VALUE_MESSAGE;
        }
        else{
            int hr = min / 60; // calc for hour
            min = min % 60; // calc for minutes
            return String.format("%02d:%02d:%02d",hr, min, sec);

            /*
            int hr = min / 60;
            int minRem = min % 60;
            return hr + "h " + minRem + "m " + sec + "s";
            */
        }
    }

    public static String getDurationString(int sec){

        // Check if seconds is less than 60, seconds and minutes not less than 0
        if (sec < 0 ){
            return INVALID_VALUE_MESSAGE;
        }
        else{
            int min = sec / 60; // calc for minutes
            int secs = sec % 60; // calc for remaining seconds
            return getDurationString(min, secs);
        }
    }

    public static void main(String[] args) {

        System.out.println(getDurationString(61,54));
        System.out.println(getDurationString(7600));
    }
}
