public class MethodOverloading{
    public static void main(String[] args){
        int newScore = calculateScore("Trishala",500);
        System.out.println("New score is: " + newScore);

        calculateScore(50);

        calculateScore();

        //challenge
        double result1 = calcFeetAndInchesToCentimeters(15, 4);
        System.out.println("Result of MethodOverloading 1 is: "+ result1);

        double result2 = calcFeetAndInchesToCentimeters(184);
        System.out.println("Result of MethodOverloading 2 is: "+ result2);
    }

    public static int calculateScore(String playerName, int score) {
        
        System.out.println("Player " + playerName + " has scored " + score + " points."); 
        return score * 1000; 
    }

    public static int calculateScore(int score) {
        
        System.out.println("Unnamed player has scored " + score + " points."); 
        return score * 1000; 
    }

    public static int calculateScore() {
        
        System.out.println("No player has scored no points."); 
        return 0; 
    }

    //Challenge solution
    public static double calcFeetAndInchesToCentimeters(double feet,double inches){
        if((feet>=0) && (inches>=0 && inches<=12)){
            double centimeters= (feet*12*2.54) + (inches*2.54);
            return centimeters;
        }
        return -1;
    }


    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches>=0){
            double feet = (int) (inches/12);
            double remainingInches = inches%12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        return -1;
    }
}