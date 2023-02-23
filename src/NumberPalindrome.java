public class NumberPalindrome {
        public static void main(String[] args) {

            System.out.println(isPalindrome(-1221));  // → should return true
            System.out.println(isPalindrome(707));  // → should return true
            System.out.println(isPalindrome(11212));  // → should return false because reverse is 21211 and
                                                             // that is not equal to 11212.
        }

        public static boolean isPalindrome(int number) {

            // create reverse and lastDigit variables
            int reverse = 0;
            int lastDigit = 0;

            // create a copy of orig number to compare at the end as number will zero in while loop
            int numCopy = number;

            // make negative numbers positive
            if (number < 0) {
                number *= -1;
                numCopy *= -1;
            }

            while (number > 0) {
                // grab the last digit
                lastDigit = number % 10;
                // increase the place value of reverse
                reverse *= 10;
                // add the last digit
                reverse += lastDigit;
                // reduce the number
                number /= 10;
            }
            // check reverse against numCopy as number is now 0
            if (reverse == numCopy) {
                return true;
            } else {
                return false;
            }
        }
    }
//    Write a method called isPalindrome with one int parameter called number.
//
//        The method needs to return a boolean.
//
//        It should return true if the number is a palindrome number otherwise it should return false.
//
//        Check the tips below for more info about palindromes.
//
//        Example Input/Output
//
//        isPalindrome(-1221); → should return true
//
//        isPalindrome(707); → should return true
//
//        isPalindrome(11212); → should return false because reverse is 21211 and that is not equal to 11212.
//
//        Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to
//        the original number. For example: 121, 12321, 1001 etc.
//
//        Tip: Logic to check a palindrome number
//
//        Find the reverse of the given number. Store it in some variable say reverse. Compare the
//        number with reverse.
//
//        If both are the same then the number is a palindrome otherwise it is not.
//
//        Tip: Logic to reverse a number
//
//        Declare and initialize another variable to store the reverse of a number, for example reverse = 0.
//
//        Extract the last digit of the given number by performing the modulo division (remainder).
//        Store the last digit to some variable say lastDigit = num % 10.
//        Increase the place value of reverse by one.
//        To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//        Add lastDigit to reverse.
//        Since the last digit of the number is processed, remove the last digit of num. To remove the
//        last digit divide number by 10.
//        Repeat steps until number is not equal to (or greater than) zero.
//
//        A while loop would be good for this coding exercise.
//
//
//        Tip: Be careful with negative numbers. They can also be palindrome numbers.
//
//        Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number
//        with the starting number (parameter).
//
//        NOTE: The method isPalindrome needs to be defined as public static like we have been doing
