public class DayOfTheWeekChallenge {
//    Write a method with the name printDayOfTheWeek that has one parameter of type int
//    and name it day.
//
//    The method should not return any value (hint: void)
//
//    Using a switch statement print gSundayh, gMondayh, c ,gSaturdayh
//    if the int parameter gdayh is 0, 1, c , 6 respectively,
//    otherwise it should print gInvalid dayh.
//
//    Bonus:
//    Write a second solution using if then else, instead of using switch.
//    Create a new project in IntelliJ with the  name gDayOfTheWeekChallengeh

    public static void printDayOfTheWeek(int day) {

        switch(day){
            case 0: {
                System.out.println("Sunday");
                break;
            }
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thursday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
        }

        if (day == 0){
            System.out.println("Day is Sunday");
        } if (day == 1) {
            System.out.println("Day is Mon");
        }
        if (day == 2) {
            System.out.println("Day is Tues");
        }
        if (day == 3) {
            System.out.println("Day is Wed");
        }
        if (day == 4) {
            System.out.println("Day is Thurs");
        }
        if (day == 5) {
            System.out.println("Day is Fri");
        }
        if (day == 6) {
            System.out.println("Day is Sat");
        }
    }
}
