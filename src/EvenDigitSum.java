public class EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));  // → should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252));  // → should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22));  // → should return -1 since the number is negative

    }

    public static int getEvenDigitSum(int number) {
        // if number is negative, return -1
        if (number < 0 ) {
            return -1;
        }
        // create variable to store the sum
        int sum = 0;
        // loop while number is above 0
        while (number > 0) {
            // check if even
            if (number % 2 == 0) {
                // use modulus operator to find last digit
                sum += (number % 10);
            }
            // divide by ten to remove last digit
            number = number / 10;
        }
        return sum;
    }
}

//    Write a method named getEvenDigitSum with one parameter of type int called number.
//
//        The method should return the sum of the even digits within the number.
//
//        If the number is negative, the method should return -1 to indicate an invalid value.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
//
//        * getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
//
//        * getEvenDigitSum(-22); → should return -1 since the number is negative
//
//
//        NOTE: The method getEvenDigitSum should be defined as public static like we have been doing so far
//        in the course.
//
//        NOTE: Do not add a main method to the solution code.