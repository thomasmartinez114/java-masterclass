public class Main {
    public static void main(String[] args) {
        System.out.println(IntEqualityPrinter.printEqual(1, 1, 1)); // All are equal
        System.out.println(IntEqualityPrinter.printEqual(1, 1, 2)); // Neither are equal or different
        System.out.println(IntEqualityPrinter.printEqual(-1, -1, -1)); // Invalid Value
        System.out.println(IntEqualityPrinter.printEqual(1, 2, 3)); // All numbers are different
    }
}
