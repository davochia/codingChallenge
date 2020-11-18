class DecimalComparator{
    public static void main(String[] args) {
        System.out.println(DecimalComparator.areEqualToTwoDecimalPlaces(-3.175, -3.1756));
        System.out.println(DecimalComparator.areEqualToTwoDecimalPlaces(3.175, 3.176));
        System.out.println(DecimalComparator.areEqualToTwoDecimalPlaces(-3.123, 3.123));
        System.out.println(DecimalComparator.areEqualToTwoDecimalPlaces(3.0, 3.0));
    }
    public static boolean areEqualToTwoDecimalPlaces(double num1, double num2){
        int fNum1 = (int)(num1 * 1000);
        int fNum2 = (int)(num2 * 1000);
        return fNum1 == fNum2;
    }
}