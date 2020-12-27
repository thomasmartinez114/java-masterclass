public class getEvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int sumEven = 0;

        if (number < 0) {
            return -1;
        }

        do {
            System.out.println("The number is: " + number);
            int lastNumber = number % 10; // get last number2
            System.out.println("The last number is:" + lastNumber);

            if (lastNumber % 2 == 0) {
                sumEven += lastNumber;
            }
                number /= 10;
            System.out.println("Number /= 10 : " + number);
        } while (number != 0);
        return sumEven;

    }
}

//    Write a method named getEvenDigitSum with one parameter of type int called number.
//
//        The method should return the sum of the even digits within the number.
//
//        If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//        * getEvenDigitSum(-22); → should return -1 since the number is negative
//
//
//        NOTE: The method getEvenDigitSum should be defined as public
//        static like we have been doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.