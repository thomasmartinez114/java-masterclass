public class AreaCalculator {

    public static final double INVALID_VALUE = -1.0;
    public static final double PI = Math.PI;

    public static double area(double radius) {
        if (radius < 0) {
            return INVALID_VALUE;
        }
        double circle = radius * radius * PI;
        return circle;
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return INVALID_VALUE;
        }

        double triangleSum = x * y;
        return triangleSum;
    }
}
