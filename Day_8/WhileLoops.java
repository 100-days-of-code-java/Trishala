public class WhileLoops {
    public static void main(String[] args) {
        
        // int count = 0;
        // while (count!=6) {
        //     System.out.println("Count value is: " + count);
        //     count++;
        // }

        // System.out.println("*************************");

        // count = 0;
        // while(true) {
        //     if (count == 6) {
        //     break;   
        //     }
        //     System.out.println("Count value is: " + count);
        //     count++;
        // }

        // System.out.println("**************************");

        // for (int i = 0; i != 6; i++) {
        //     System.out.println("Count value is: " + i);  
        // }

        // System.out.println("**************************");

        
        // do {
        //     System.out.println("Count value is: " + count);
        //     count++; 
        //     if (count>100) {
        //         break;
        //     }
        // } while (count != 6);

        // System.out.println(isEvenNumber(4));

        int number = 4;
        int finalNumber = 20;
        int count = 0;

        while (number <= finalNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even No.: " + number);
            count++;
            if (count >= 5) {
                break;
            }
            
        }
        System.out.println("Total Even No.s Found: " + count);
    } 

    public static boolean isEvenNumber(int n) {
        if ( (n%2) == 0) {
            return true;
        }
        return false;
    }
}
