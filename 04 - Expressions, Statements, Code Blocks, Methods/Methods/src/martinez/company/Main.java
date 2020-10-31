package martinez.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, 5, 100);

        score = 1000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore();
    }

    // new method
    // public static int --- will say return a value of int when it isnt set as void
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your finale score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
