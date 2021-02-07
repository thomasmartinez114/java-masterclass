import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;

        while(true) {
            System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {

                int number = scanner.nextInt();

                // check if first is set to true
                // then when numbers are submitted set first to false
                if(first) {
                    first = false;
                    min = number;
                    max = number;
                }

                // test if number is > max
                if(number > max) {
                    max = number;
                }

                if(number < min) {
                    min = number;
                }

            } else {
                break;
            }

            scanner.nextLine(); // handle input
        }

        System.out.println("Min= " + min + ", max= " + max);
        scanner.close();
    }
}
