package martinez.programming;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue); // -2 billion
        System.out.println("Integer Maximum Value = " + myMaxIntValue); // 2 billion
        System.out.println("Busted MAX Value " + (myMaxIntValue + 1));  // Overflow - number too large which made it -2 billion
        System.out.println("Busted MIN Value " + (myMinIntValue - 1)); // Overflow - number is too large which made it 2 billion

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
    }
}
