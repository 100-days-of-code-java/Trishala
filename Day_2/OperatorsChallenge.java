class OperatorsChallenge {
    public static void main(String[] args) {
        double myFirstDouble = 20.00d;
        double mySecondDouble = 80.00d;
        double myTotal = 100.00d * (myFirstDouble + mySecondDouble);
        System.out.println("My total value is " + myTotal);
        double myRemainder = myTotal % 40.00d;
        System.out.println("My remainder is: " + myRemainder);

        boolean noRemainder = (myRemainder == 0) ? true:false;
        if (!noRemainder){
            System.out.println("Got some remainder.");
        }
        
    }
    
}
