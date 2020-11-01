package martinez.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your finale score was " + highScore);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your finale score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".

        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Thomas", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jayar", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sophia", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Amir", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                    + highScorePosition);
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 999) {
            return 1;
        } else if(playerScore > 499) {
            return 2;
        } else if (playerScore > 99) {
            return 3;
        }
            return 4;
    }

    // new method
    // public static int --- will say return a value of int when it isnt set as void
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

}
