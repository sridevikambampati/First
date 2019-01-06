public class IfKeywordAndCodeBolcks {
    public static void main(String args[]) {
        boolean gameOver = true;
        int score = 200;
        int levelCompleted = 5;
        int bonus = 100;

        if(score < 5000 && score >1000 ) {
            System.out.println("Your score was less than 5000 but less than 1000 ");
        } else if(score < 1000){
           System.out.println("Your score was less than 1000 ");
       } else {
            System.out.println("Print the actual score we got");
       }

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score " + finalScore);
        }

       boolean newgameOver = true;
        int  newscore = 200;
        int newlevelCompleted = 5;
        int newbonus = 100;

        if(newgameOver == true){
            int finalScore = score + (newlevelCompleted * newbonus);
            System.out.println("Your final score " + finalScore);
                }


    }
}
