package martinez.company;

public class Main {

    public static void main(String[] args) {
        int count = 6;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 1;
//        while(true) {
//            if(count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        do {
            return true;
        } while (number % 2 == 0);
    } return false;
}
