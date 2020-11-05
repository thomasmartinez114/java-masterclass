package martinez.company;

public class Main {

    public static void main(String[] args) {
        getDurationString(60, 59);
    }

    // Challenge

    // Create method getDurationString(int minutes, int seconds)
    // Validate that minutes >= 0
    // Validate that seconds >= 0 and <= 59
    // Method should return "Invalid Value" if either are not true
    // If valid, calculate how many hours minutes and seconds equal
    // the minutes and seconds passed to this method and return
    // that value as string in format "XXh YYm ZZs"

    public static int getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            System.out.println("Invalid Value");
            return -1;
        }

        int hours = minutes / 60;
        int remainMinutes = seconds / 60;
        System.out.println("Hours " + hours + " and Minutes " + remainMinutes);
        return hours;
    }

    // Create 2nd method with same name with only one param seconds
    // Validate that it is >= 0 and return "Invalid value" if not true
    // If valid, calc how many minutes are in the seconds value then
    // call the other overloaded method passing the correct minutes and seconds
    // calculated so that it can calculate correctly
    // Call both methods to print values to console

    // Tips
    // Use int or long for number data types
    // Methods should be static

    // Bonus
    // For the input 61 mins output should be 01h 01m 00s, but ok if it is
    // 1h 1m 0s (use if-else)
}
