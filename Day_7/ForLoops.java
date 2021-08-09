public class ForLoops {
    public static void main(String[] args){
        System.out.println("10,000 at 2% interest is: " + calculateInterest(10_000.0, 2.0));
        System.out.println("10,000 at 3% interest is: " + calculateInterest(10_000.0, 3.0));
        System.out.println("10,000 at 4% interest is: " + calculateInterest(10_000.0, 4.0));
        System.out.println("10,000 at 5% interest is: " + calculateInterest(10_000.0, 5.0));

        for(int i = 0; i < 5; i++) {
            System.out.println("loop " + i + " Hello!!");
        }

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest is: " + String.format("%.2f",calculateInterest(10_000.0,i)));
        }  //new thing to learn about

        System.out.println("**************************************************");

        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest is: " + String.format("%.2f",calculateInterest(10_000.0,i)));
        }
    }
    public static double calculateInterest(double amount, double interest) {
        return(amount * (interest / 100.0));
    }
}
