public class Operators{
    public static void main(String[] args){
        int result = 1 + 2;  //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("Previous result= " + previousResult);
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("Previous result= " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4 
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of (4 % 3) is 1
        System.out.println("4 % 3 = " + result);


        //using abbreviations

        // result = result + 1
        result++; // 1 + 1 = 2
        System.out.println(result);

        // result = result - 1
        result--; // 2 - 1 = 1
        System.out.println(result);

        // result = result + 2
        result += 2; // 1 + 2 = 3
        System.out.println(result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println(result);
        
        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println(result);

        //using if then statements
        boolean isAlien = false;
        if(isAlien==false) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of Aliens");
        }
        // Donot add ';' after if statements as the condition will terminate
        //Always add codeblock while declaring if statement (Codebloacks can be added by using {})

        int topScore = 80;
        if(topScore != 100){
            System.out.println("You got the highest score!");
        }

        int secondTopScore = 95;
        if(topScore > secondTopScore && topScore < 100) {
            System.out.println("You scored greater than second top score but less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }


        //Assignment Vs. Equals to operator
        //in If always pass == into parameter
        int newValue = 50;
        if (newValue == 50){
            System.out.println("New Value is 50. ");
        }

        boolean isCar = false;
        if (isCar==true){
            System.out.println("It is a car. ");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        }
    }
}