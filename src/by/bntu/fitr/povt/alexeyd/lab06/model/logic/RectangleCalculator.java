package by.bntu.fitr.povt.alexeyd.lab06.model.logic;

public class RectangleCalculator {

    //Method takes TWO parameters - sides of rectangle and returns perimeter
    public static double calculatePerimeter(double a, double b) {
        double perimeter = 2 * a + 2 * b;
        return perimeter;
    }

    //Method takes TWO parameters - sides of rectangle and returns area
    public static double calculateArea(double a, double b) {
        double area = a * b;
        return area;
    }
}
