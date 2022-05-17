public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        printYearsAndDays(1051200); // method
    }
    public static void printYearsAndDays(long minutes){
        if(minutes < 0){
            System.out.println("Invalid.");
        }else{       // casting.
            int year = (int) minutes / 525600; // to find year.
            int day = (int) minutes / 1440; // to find day.
            int remainingMinutes = day / 525600; // to find minutes.
            System.out.println(year + " Year  " + day + " Day  " + remainingMinutes + "Minutes");
        }
    }
}