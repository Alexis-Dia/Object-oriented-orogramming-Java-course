package by.bntu.fitr.povt.alexeyd.lab4;

public class TriangleLogic {

    //That method calculates, is it triangle or not.
    public static boolean isTriangle(double a, double b, double c) {
        boolean conditionAB = a + b > c;
        boolean conditionAC = a+ c > b;
        boolean conditionBC = b + c > a;
        boolean answer = conditionAB && conditionAC && conditionBC;
        return answer;
    }
}
