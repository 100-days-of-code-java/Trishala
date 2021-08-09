public class PrimeNoCheck {
    public static void main(String argv[]) {
        // boolean isPrimeOrNot = isPrime(7);
        // System.out.println(isPrimeOrNot);
        int count = 0;
        for (int i=10; i<50; i++) {
            if(isPrime(i)) {
                System.out.println("Number " + i + " is prime");
                count++;
                if (count == 10) {
                    System.out.println("Exiting...");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } 
        for (int i = 2; i <= n/2; i++) { //or you can you i <= (long) Math.sqrt(n) in termination part to further optimise your code 
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
