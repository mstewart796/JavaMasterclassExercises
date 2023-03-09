public class LargestPrime {
    public static void main(String[] args) {

        System.out.println(getLargestPrime (21));  // should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime (217)); // should return 31 since 31 is the largest prime (7 * 31
        // = 217)
        System.out.println(getLargestPrime (0));  // should return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime (45));  // should return 5 since 5 is the largest prime (3 * 3 * 5
        // = 45)
        System.out.println(getLargestPrime (-1)); // should return -1 since the parameter is negative

    }

    public static int getLargestPrime(int number) {

        // check if negative or not prime
        if (number < 2) {
            return -1;
        }

        // for loop to go through all possibilities
        // i tried with  i = number / 2 but this failed the check for 4 on udemy
        for (int i = 2; i < number; i++) {
            // check if number divided by i leaves a remainder
            if (number % i == 0) {
                // is so divide by this number
                number /= i;
                // reset increment
                i--;
            }
        }
        return number;
    }
}



//    Write a method named getLargestPrime with one parameter of type int named number.
//
//        If the number is negative or does not have any prime numbers, the method should return -1 to
//        indicate an invalid value.
//
//
//        The method should calculate the largest prime factor of a given number and return it.
//
//
//        EXAMPLE INPUT/OUTPUT:
//
//        * getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
//
//        * getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
//
//        * getLargestPrime (0); should return -1 since 0 does not have any prime numbers
//
//        * getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
//
//        * getLargestPrime (-1); should return -1 since the parameter is negative
//
//
//        HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
//
//        NOTE: The method getLargestPrime should be defined as public static like we have been doing so
//        far in the course.
//
//        NOTE: Do not add a main method to the solution code.


// ideal solution:
//    public static int getLargestPrime(int number) {
//        if (number < 2) return -1;
//        for (int i = 2; i < number; i++) { // can optimize with i <= number/2;
//            if (number % i == 0){
//                number /= i;
//                i--; // neutralize the i++ increment to check i again
//            }
//        }
//        return number;
//    }
//}