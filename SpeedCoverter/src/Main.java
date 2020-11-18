public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(35.90);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConverter(35.90);
    }

}
