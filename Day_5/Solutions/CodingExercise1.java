// Speed Converter

public class CodingExercise1 {

    public static void main(String[] args) {
        printConversion(10.5);
    }

    public static void printConversion(double KilometersPerHour) {
        if(KilometersPerHour<0) {
            System.out.println("Invalid Value");
        }
        long milesPerHour = toMilesPerHour(KilometersPerHour);
        System.out.println(KilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour<0) {
            return -1;
        }
        // 1 mile per hour = 1.609 kmph
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        return milesPerHour;
    } 
}
