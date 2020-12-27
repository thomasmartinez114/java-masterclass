public class palindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int InitialNumber = number;

        do {
            int lastDigit = number % 10;
            reverse = reverse * 10;
            reverse += lastDigit;
            number /= 10;
        } while (number != 0);
        {
            //System.out.println("reverse =" + reverse);
            //if
            return (InitialNumber == reverse); //return true;
            // else return false;

        }

    }
}
