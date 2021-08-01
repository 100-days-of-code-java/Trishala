public class TeenNumberChecker {
    public static void main(String[] args) {
        
        boolean myResult = hasTeen(9,99,19);
        System.out.println(myResult);

    }

    public static boolean hasTeen(int integer1, int integer2, int integer3) {
        if (isTeen(integer1) || isTeen(integer2) || isTeen(integer3)){
            return true;
        }
        return false;
        
    }

    public static boolean isTeen (int integer) {
        if (integer>=13 && integer<=19){
            return true;
        }
        return false;
    }
}
