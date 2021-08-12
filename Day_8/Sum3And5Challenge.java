public class Sum3And5Challenge {
    public static void main(String[] args) {
     
    int sum = 0;
    int count = 0;
    for (int i=1; i<=1000; i++) {
        if ((i%3==0) && (i%5==0)) {
            sum += i;
            System.out.println("No. divisible by 3 & 5: " + i);
            count++;   
        }
        if (count==5) {
            System.out.println("Exiting loop... ");
            break;
        }
    }
    System.out.println("Sum = " + sum);
        
    }
}