public class EqualSumChecker {
    public static void main(String[] args) {
        
        boolean myResult = hasEqualSum(1, 1, 1);
        System.out.println(myResult);

    }

    public static boolean hasEqualSum(int integer1, int integer2, int integer3) {
        if(integer3 == integer1 + integer2) return true;
        else return false;
    }




}
