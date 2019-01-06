public class Methods {
    public static void main(String args[]) {
        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your  score was " + highScore);

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("your final score was " + highScore);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = 0;

        if (gameOver) {
            finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
        }
        return finalScore;

    }
}





