public class Strings {
    public static void main(String[] args){
       //byte
       //short
       //int
       //long
       //float
       //double
       //char
       //boolean 
       String myString = "This is a string";
       System.out.println(myString);
       myString = myString + " and there is more.";
       System.out.println(myString);
       myString = myString + " \u00A9 2019";
       System.out.println(myString);

       String myNumberString = "250.55";
       myNumberString = myNumberString + "49.95";
       System.out.println(myNumberString);

       String myLastString ="10";
       int myInt = 50;
       myLastString = myLastString + myInt;
       System.out.println(myLastString);

       double myDouble = 120.7d;
       myLastString = myLastString + myDouble;
       System.out.println(myLastString);
    }
}
