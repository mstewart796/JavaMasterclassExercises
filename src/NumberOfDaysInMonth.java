public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(1, 2020));  // → should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020));  // → should return 29 since February has 29 days
        System.out.println(getDaysInMonth(2, 2018));  // → should return 28
        System.out.println(getDaysInMonth(-1, 2020));  // → should return -1
        System.out.println(getDaysInMonth(1, -2020));  // → should return -1

    }

    public static boolean isLeapYear(int year) {

        if (year <= 1 || year > 9999) {
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    // year is evenly divisible by 4, 100 and 400
                    return true;
                } else {
                    // year is not evenly divisible by 4, 100 and 400
                    return false;
                }
            } else {
                // year is evenly divisible by 4 but not 100
                return true;
            }
        } else {
            // year is not evenly divisible by 4
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9999) {
            return -1;
        }

        int numberOfDays;
        switch (month) {
            case 1:
                numberOfDays = 31;
                break;
            case 2:
                if (isLeapYear(year)) {
                    numberOfDays = 29;
                }
                else numberOfDays = 28;
                break;
            case 3:
                numberOfDays = 31;
                break;
            case 4:
                numberOfDays = 30;
                break;
            case 5:
                numberOfDays = 31;
                break;
            case 6:
                numberOfDays = 30;
                break;
            case 7:
                numberOfDays = 31;
                break;
            case 8:
                numberOfDays = 31;
                break;
            case 9:
                numberOfDays = 30;
                break;
            case 10:
                numberOfDays = 31;
                break;
            case 11:
                numberOfDays = 30;
                break;
            case 12:
                numberOfDays = 31;
                break;
            default:
                numberOfDays = -1;
                break;
        }


//        switch (month) {
//            case 1 -> numberOfDays = 31;
//            case 2 -> {
//                if (isLeapYear(year)) {
//                    numberOfDays = 29;
//                } else {
//                    numberOfDays = 28;
//                }
//            }
//            case 3 -> numberOfDays = 31;
//            case 4 -> numberOfDays = 30;
//            case 5 -> numberOfDays = 31;
//            case 6 -> numberOfDays = 30;
//            case 7 -> numberOfDays = 31;
//            case 8 -> numberOfDays = 31;
//            case 9 -> numberOfDays = 30;
//            case 10 -> numberOfDays = 31;
//            case 11 -> numberOfDays = 30;
//            case 12 -> numberOfDays = 31;
//            default -> numberOfDays = -1;
//        }
        return numberOfDays;
    }
}


//
//        Write another method getDaysInMonth with two parameters month and year.  ​Both of type int.
//
//        If parameter month is < 1 or > 12 return -1. ​
//        If parameter year is < 1 or > 9999 then return -1.
//
//        This method needs to return the number of days in the month. Be careful about leap years they
//        have 29 days in month 2 (February).
//
//        You should check if the year is a leap year using the method isLeapYear described above.
//
//        Examples of input/output:
//
//        * getDaysInMonth(1, 2020); → should return 31 since January has 31 days.
//
//        * getDaysInMonth(2, 2020); → should return 29 since February has 29 days in a leap year and
//        2020 is a leap year.
//
//        * getDaysInMonth(2, 2018); → should return 28 since February has 28 days if it's not a leap
//        year and 2018 is not a leap year.
//
//        * getDaysInMonth(-1, 2020); → should return -1 since the parameter month is invalid.
//
//        * getDaysInMonth(1, -2020); → should return -1 since the parameter year is outside the range of 1 to 9999.
//
//
//        HINT: Use the switch statement.
//
//        NOTE: Methods isLeapYear and getDaysInMonth need to be public static like we have been doing
//        so far in the course.
//
//        NOTE: Do not add a main method to solution code.