public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 10_000;
        int myMaxIntValue = Integer.MAX_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;

        System.out.println("The max value of integer data type is: " +  myMaxIntValue);
        System.out.println("The min value of integer data type is: " +  myMinIntValue);
        System.out.println("Busted max value: " + (myMaxIntValue + 1)); // Overflow in java
        System.out.println("Busted min value: " + (myMinIntValue - 1)); // Underflow in java

        byte myMinbyteValue = Byte.MIN_VALUE;
        byte myMaxbyteValue = Byte.MAX_VALUE;
        System.out.println("Min byte value: " + myMinbyteValue);
        System.out.println("Max byte Value: " + myMaxbyteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min Short Value: " + myMinShortValue);
        System.out.println("Max Short Value: " + myMaxShortValue);

        long myLongValue = 2147483647889L; 
        //Removing L will cause error as no. will be treated as int without L and the given literal exceeds the range of Int
        //Hence the L forces the system to store the value as a long type rather than int 
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min Long Value: " + myMinLongValue);
        System.out.println("Max Long Value: " + myMaxLongValue);
        System.out.println(myLongValue);

        int myNewIntValue = (myMinIntValue / 2);
        int myNewShortValue = (short) (myMinShortValue / 2); //Casting in java
        
    }
}
