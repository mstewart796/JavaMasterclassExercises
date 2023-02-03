public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(65, -45));

    }

    public static String getDurationString(int seconds) {

        // int minutes = seconds / 60;
        // int remaindingSeconds = seconds % 60;

        // validate if >=0
        if (seconds >= 0) {
            // call second method to return results
            return getDurationString(seconds / 60, seconds % 60); // replaces variables
        } else {
            return "Invalid input (" + seconds + ") must be a positive value";
        }
    }

    public static String getDurationString(int minutes, int seconds) {

        // return "XXh YYm ZZs"
        // validate if >=0 (minutes) and <= 59 (seconds)
        int hours = (seconds + (minutes * 60)) / 3600;
        if (minutes >= 0 && seconds <= 59 && seconds >=0) {
            if (hours > 0) {
                minutes = minutes - (hours * 60);
                return hours + "h " + minutes + "m " + seconds + "s";
            } else {
                return hours + "h " + minutes + "m " + seconds + "s";
            }
        } else {
            return "Invalid input";
        }
    }
}
