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
    }
}
