public class MinsToYears {

    public static final String INVALID_VALUE = "Invalid Value";

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println(INVALID_VALUE);
        }

        long hours = minutes / 60;
        //System.out.println("HOURS " + hours);
        long days = hours / 24;
        //System.out.println("DAYS " + days);
        long years = days / 365;
        //System.out.println("YEARS " + years);

        // print XX min = YY y and ZZ d
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
