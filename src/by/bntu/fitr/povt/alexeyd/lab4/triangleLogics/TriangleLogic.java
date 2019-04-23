package by.bntu.fitr.povt.alexeyd.lab4.triangleLogics;

public class TriangleLogic {

    //That method calculates, is it triangle or not.
    public static boolean isTriangle(double a, double b, double c) {
        boolean conditionAB = a + b > c;
        boolean conditionAC = a+ c > b;
        boolean conditionBC = b + c > a;
        boolean answer = conditionAB && conditionAC && conditionBC;
        return answer;
    }

    //That method calculates, has triangle equal sides.
    public static boolean triangleHasEqualsSides(double a, double b, double c) {
        boolean conditionA = a == b;
        boolean conditionB = a == c;
        boolean conditionC = b == c;
        boolean answer = conditionA && conditionB && conditionC;
        return answer;
    }
}
