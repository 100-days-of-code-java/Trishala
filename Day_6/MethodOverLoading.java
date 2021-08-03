public class MethodOverLoading {
    public static void main(String[] args) {

        // int newScore = calculateScore("Tim", 500);
        // System.out.println(newScore);

        // calculateScore(75);
        // calculateScore();

        calcFeetAndInchesToCentimeters (6,0);

        calcFeetAndInchesToCentimeters (100);
    }

    // public static int calculateScore (String playerName, int score){
    //     System.out.println("Player " + playerName + " has scored " + score + " points.");
    //     return score * 1000;
    // }

    // public static int calculateScore (int score){
    //     System.out.println("Unnamed player has scored " + score + " points.");
    //     return score * 1000;
    // }

    // public static int calculateScore (){
    //     System.out.println("No player name and no score.");
    //     return 0;
    // }

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if ((feet >= 0) && (inches >=0 && inches<=12) ){

            double centimeters = (feet * 12) * 2.54;
            centimeters = (centimeters + (inches * 2.54));
            System.out.println(feet + " feet & " + inches + " inches = " + centimeters + " centimeters.");
            return centimeters;
        } else {
            System.out.println("Invalid no.s");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >=0) {
            
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and  "+ remainingInches);
            return calcFeetAndInchesToCentimeters(feet, inches);
        } else {
            System.out.println("Invalid no.s");
            return -1;
        }
    }

    

}