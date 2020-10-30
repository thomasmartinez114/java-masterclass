package martinez.company;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens.");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        // Tenary Operator
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        // Challenge
        double doubleOne = 20.00d;
        double doubleTwo = 80.00d;
        double doubleSum = (doubleOne + doubleTwo) * 100.00d;
        System.out.println("Total values: " + doubleSum);
        double remainder = doubleSum % 40.00d;
        System.out.println("Remainder: " + remainder);
        boolean isZero = remainder == 0 ? true : false;
        System.out.println("isZero: " + isZero);
        if (!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
