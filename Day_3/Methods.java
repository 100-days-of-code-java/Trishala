public class Methods {
    public static void main(String[] args){

        int highScore = calculateScore(false, 800, 5, 100);
        System.out.println("Your final score: " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score: " + highScore);

        
        
        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Trishala", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Tanvi", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Banaja", position);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        } 
        return -1; 
        
    }

    public static void displayHighScorePosition(String playerName, int positon) {
        System.out.println(playerName + " managed to get into position " + positon + " on the high score table.");

    }

    public static int calculateHighScorePosition (int playerScore) {
        // if (playerScore >= 1000) {
        //     return 1;
        // } else if (playerScore>=500) {
        //     return 2;
        // } else if (playerScore>=100) {
        //     return 3;
        // }
        // return 4;

        int position=4; //assuming position 4 to be returned

        if(position>=1000) {
            return 1;
        } else if (position >= 500) {
            return 2;
        } else if(playerScore>=100) {
            return 3;
        }
        return position;
    }
   
    
}
