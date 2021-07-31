public class IfKeywordAndCodeBlocks {
    public static void main(String[] args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        
        // if(score < 5000 && score > 1000) {
        //     System.out.println("Your score was less than 5000");
        // } else if(score < 1000) {
        //     System.out.println("your score was less than 1000");
        // } else {
        //     System.out.println("Got here");
        // }

        if(gameOver==true) {
            int finalScore = score + (levelCompleted * bonus);
            // finalScore temporary variable created inside the code block but after the execution of the code block it will be automatically discarded and cant be out outside this code block

            System.out.println("Your final score: " + finalScore);
        }

        // int score2 = 10000;
        // int levelCompleted2 = 8;
        // int bonus2 = 200;
        // if(gameOver) {
        //     int finalScore2 = score2 + (levelCompleted2 * bonus2 );
        //     System.out.println("Your final score: " + finalScore2);
        // }

        //challenge
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        if(gameOver==true) {
            int finalScore = score + (levelCompleted * bonus);
            // finalScore temporary variable created inside the code block but after the execution of the code block it will be automatically discarded and cant be out outside this code block

            System.out.println("Your final score: " + finalScore);
        }
    }
}
