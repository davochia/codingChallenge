public class AreaCalculator {
    public static double Area(double radius){
        // Return -1 if invalid value
        if (radius < 0){
            return -1;
        }
        else{
            return Math.PI * (radius * radius);// calc area of circle
        }

    }

    public static double Area(double x, double y){
        // Return -1 if invalid value
        if (x < 0 || y < 0){
            return -1;
        }
        else{
            return x * y;// calc area of rectangle
        }

    }

    public static void main(String[] args) {
        System.out.println("Area of circle: " + Area(-34));
        System.out.println("Area of rectangle: " + Area(4, 5));
    }
}
