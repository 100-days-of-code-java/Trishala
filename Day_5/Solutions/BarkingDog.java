public class BarkingDog {
    public static void main(String[] args) {

        boolean myResult = shouldWakeUp(true, -1);
        System.out.println(myResult);
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
            
        if (barking == true && (hourOfDay < 8 || hourOfDay > 22) && (hourOfDay >=0 && hourOfDay <= 23)) {
            return true;
        } else {
            return false;
        }     
        
    }
}
