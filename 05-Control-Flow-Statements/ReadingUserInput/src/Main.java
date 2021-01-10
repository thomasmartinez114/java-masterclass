import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handle next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        int age = 2020 - yearOfBirth;

        if(age >= 0 && age <= 100) {
            System.out.println("Your name is " + name + " and age is " + age);
        } else {
            System.out.println("Invalid year of birth");
        }

        scanner.close();
    }
}
