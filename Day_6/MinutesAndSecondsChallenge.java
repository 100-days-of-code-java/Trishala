public class MinutesAndSecondsChallenge {
    public static void main(String[] args) throws Exception {

        String myOutput = getDurationString(121, 60);
        System.out.println(myOutput);

        String myOutput2 = getDurationString(3945);
        System.out.println(myOutput2);
        

        
    }

    public static String getDurationString (int minutes, int seconds){
        if ((minutes>=0) && (seconds>=0 && seconds<=60)) {
            int hours = (minutes / 60);
            int remminutes = (minutes % 60);
            String myResult = hours + "h " + remminutes + "m " + seconds + "s";
            return myResult;

        } else {
            return "Invalid Value";
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds>=0){
            int minutes = seconds / 60;
            int remseconds = seconds % 60;
            return getDurationString(minutes, remseconds);
            

        } else {
            return "Invalid Value";
        }
    }    
    
}
