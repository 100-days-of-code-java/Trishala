

public class DecimalConverter {
    public static void main(String[] args) {

        areEqualByThreeDecimalPlaces(-2.1756d, -2.65d);
        
    }


    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        long a = (long)one * 1000;
        long b = (long)two * 1000;

        if (a == b) {
            System.out.println("True");
            return true;
        }
        else {
            System.out.println("False");
            return false;
        }
    }
}
