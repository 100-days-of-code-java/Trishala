public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {

        System.out.println(getDuration(65,45));

        System.out.println(getDuration(3665));
    } 
    private static String getDuration(int minutes,int seconds) {
        if((minutes>=0) && (seconds>=0 && seconds<=59)){
            int hours = minutes/60;
            int remainingMinutes = minutes%60;
            
            String hourString = hours + "h";
            if(hours<10){
                hourString = "0" + hourString;
            }
            String minutesString = remainingMinutes + "m";
            if(remainingMinutes<10){
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if(seconds<10){
                secondsString = "0" + secondsString;
            }
            return hourString + " " + minutesString + " " + secondsString;
        }
        return INVALID_VALUE_MESSAGE; 
    }

    private static String getDuration(int seconds) {
        if(seconds>=0){
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            return getDuration(minutes,remainingSeconds);
        }
        return INVALID_VALUE_MESSAGE;
    }
}
