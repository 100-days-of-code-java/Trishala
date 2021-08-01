public class LeapYearCalculator {
    public static void main(String[] args) {
        
        boolean myResult = isLeapYear(2017);
        System.out.println(myResult);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 0 && year <= 9999) {

            if((year % 4 == 0) && (year % 100 == 0) && (year % 400 ==0)) {
                return true;
            } else if ((year % 4 == 0) && (year % 100 != 0)) {
                return true;
            }
            return false;
        }
        return false;
    }

}
