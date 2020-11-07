import java.awt.geom.Area;

public class Main {

    public static void main(String[] args) {
        System.out.println(AreaCalculator.area(5.0)); // return 78.53975
        System.out.println(AreaCalculator.area(-1)); // return -1
        System.out.println(AreaCalculator.area(5.0, 4.0)); // return 20.0
        System.out.println(AreaCalculator.area(-1.0, 4.0)); // return -1
    }
}
