public class FeetInchesCalculator{
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        double cm;
        if((feet >= 0)&&(inches >= 0 && inches <= 12)){
            //cm = (feet * 12) * 2.54;
            //cm += inches * 2.54;
            cm = (30.48 * feet) + (2.54 * inches);
            System.out.println(feet + " feet, " + inches + " inches = " + cm + "cm");
            return cm;
        }
        else{
            System.out.println("Invalid feet or inches value");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        double feet, inch;
        if(inches >= 0){
            feet = (int)inches/12;
            inch = (int)inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + inch + "inches");
            return calcFeetAndInchesToCentimeters(feet,inch);
        }
        else{
            return -1;
        }
    }

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(7, 4);
        calcFeetAndInchesToCentimeters(100);
    }
}
