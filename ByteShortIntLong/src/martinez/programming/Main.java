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

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        
        int myTotal = (myMinIntValue / 2);
        
        byte myNewByteValue = (byte) (myMinByteValue / 2);

    }
}
