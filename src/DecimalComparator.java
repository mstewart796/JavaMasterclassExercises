public class DecimalComparator {

    public static void main(String[] args) {

        System.out.println("First:");
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));  // should return true
        System.out.println("Second:");
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));  // should return false
        System.out.println("Third:");
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));  // should return true
        System.out.println("Fourth:");
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));  // should return false

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {

        // multiply by 1000 and cast the double to an int to round up
        firstNumber = (int) (firstNumber * 1000);
        secondNumber = (int) (secondNumber * 1000);

        if (firstNumber == secondNumber) {
            return true;
        } else {
            return false;
        }
    }
}

//    Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//
//        The method should return boolean and it needs to return true if two double numbers are the same up to
//        three decimal places. Otherwise, return false.
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal
//        up to 3 decimal places.
//
//        * areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal u
//        p to 3 decimal places
//
//        * areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
//
//        * areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal
//        up to 3 decimal places.
//
//
//        TIP: Use paper and pencil.
//
//        TIP: Use casting.
//
//        NOTE: The areEqualByThreeDecimalPlaces method  needs to be defined as public static
//like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.