package martinez.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tom", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        calcFeetAndInchesToCentimeters(12, 10);
        calcFeetAndInchesToCentimeters(2);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    // Method Overloading
    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {
        if (feet > 0) {
            double cmFeet = feet / 0.032808;
            System.out.println("Feet to CM = " + cmFeet);
            return cmFeet;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int feet) {
        if (feet >= 0) {
            double feetToInches = feet * 0.0833;
            System.out.println(feetToInches);
            return feetToInches;
        } else {
            return -1;
        }
    }

}
