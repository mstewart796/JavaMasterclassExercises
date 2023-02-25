public class FirstLastDigitSum {
    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(252));  // → should return 4, the first digit is 2 and the last
        // is 2 which gives us 2+2 and the sum is 4.

        System.out.println(sumFirstAndLastDigit(257));  // → should return 9, the first digit is 2 and the last
        // is 7 which gives us 2+7 and the sum is 9.

        System.out.println(sumFirstAndLastDigit(0));  // → should return 0, the first digit and the last digit
        // is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.

        System.out.println(sumFirstAndLastDigit(5));  // → should return 10, the first digit and the
        // last digit is 5 since we only have digit, which gives us 5+5 and the sum is 10.

        System.out.println(sumFirstAndLastDigit(-10)); // → should return -1, since the parameter is negative
        // and needs to be positive.

    }
    public static int sumFirstAndLastDigit(int number) {

        // if number is negative, return -1
        if (number < 0 ) {
            return -1;
        }

        // sum does not need to be initialized with a value
        int sum;
        // first digit can be found already through the modulus operator
        int firstDigit = number % 10;
        // create and initialize a variable to track the current digit in a while loop
        int currentDigit = 0;
        // create but don't initialize a variable to store the final digit;
        int lastDigit;

        // while loop that stores the current digit
        while (number > 0) {
            // modulus operator to find last digit
            currentDigit = number % 10;
            // reduce size of number to move on to next digit
            number /= 10;
        }

        // as while loop has ended, the current digit must be the final digit
        lastDigit = currentDigit;
        // sum first and last digits
        sum = firstDigit + lastDigit;
        // return sum
        return sum;
    }

}

//    Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//
//        The method needs to find the first and the last digit of the parameter number passed to the method,
//        using a loop and return the sum of the first and the last digit of that number.
//
//        If the number is negative then the method needs to return -1 to indicate an invalid value.
//
//        Example input/output
//
//        * sumFirstAndLastDigit(252); → should return 4, the first digit is 2 and the last is 2 which gives us
//        2+2 and the sum is 4.
//
//        * sumFirstAndLastDigit(257); → should return 9, the first digit is 2 and the last is 7 which gives us
//        2+7 and the sum is 9.
//
//        * sumFirstAndLastDigit(0); → should return 0, the first digit and the last digit is 0 since we only have
//        1 digit, which gives us 0+0 and the sum is 0.
//
//        * sumFirstAndLastDigit(5); → should return 10, the first digit and the last digit is 5 since we only have
//        1 digit, which gives us 5+5 and the sum is 10.
//
//        * sumFirstAndLastDigit(-10); → should return -1, since the parameter is negative and needs to be positive.
//
//
//        NOTE: The method sumFirstAndLastDigit needs to be defined as public static like we have been doing
//        so far in the course.
//
//        NOTE: Do not add a  main method to solution code.