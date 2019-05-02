package by.bntu.fitr.povt.alexeyd.lab06.model.logic;

public class CircleCalculator {

    private static final double PI = 3.141592653;

    //Method takes parameter - radius of circle and returns length of circle
    public static double calculateLength(double r) {
        double length = 2 * PI * r;
        return length;
    }

    //Method takes parameter - radius of circle and returns area
    public static double calculateArea(double r) {
        double area = PI * Math.pow(r, 2);
        return area;
    }
}
