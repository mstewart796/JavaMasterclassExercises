public class SharedDigit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(12, 23));  // → should return true since the digit
        // 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99));  // → should return false since 9 is not
        // within the range of 10-99
        System.out.println(hasSharedDigit(15, 55));  // → should return true since the digit
        // 5 appears in both numbers
        System.out.println(hasSharedDigit(12, 42));
    }

    public static boolean hasSharedDigit(int numberOne, int numberTwo) {

        // check that both numbers are between 10 and 99 (inclusive) else return false
        if (numberOne < 10 || numberTwo < 10 || numberOne > 99 || numberTwo > 99) {
            return false;
        }
        // store the two digits of the first number in separate variables to compare later
        int digitOne = numberOne % 10, digitTwo = (numberOne / 10) % 10;
        // create a boolean variable to store outcome
        boolean checker = true;
        // while loop to compare
        while (numberTwo > 0) {
            // check if either digit of numberOne matches the first then second digit of numberTwo
            if (numberTwo % 10 == digitOne || numberTwo % 10 == digitTwo) {
                // return true and exit loop
                checker = true;
                // set numberTwo to 0 to exit loop
                numberTwo = 0;
            } else {
                // else return false and reduce size of numberTwo to check next digit
                checker = false;
                numberTwo /= 10;
            }
        }
        // if checker is true return true
        if (checker) {
            return true;
        } else {
            // else return false
            return false;
        }
    }
}

//    Write a method named hasSharedDigit with two parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers
//        is not within the range, the method should return false.
//
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and
//        23; otherwise, the method should return false.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
//
//        * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
//
//        * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
//
//
//        NOTE: The method hasSharedDigit should be defined as public static like we have been
//        doing so far in the course.
//
//        NOTE: Do not add a main method to the solution code.