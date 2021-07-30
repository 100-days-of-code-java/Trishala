public class CharAndBoolean {
    public static void main(String[] args){
        char myChar ='D';
        char myUnicodeChar = '\u0044'; // unicode for 'D' is 0044
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        //unicode is another of represention characters
        //search on google for unicode table to know which code represents which character
        // '\ u' is necessary before any unicode as it specifies that the next no.s represent unicode
        
        char myCopyrightchar = '\u00A9'; //unicode for copyright symbol is 00A9
        System.out.println(myCopyrightchar);
    
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
        
    }
    
}