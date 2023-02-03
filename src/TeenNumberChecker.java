public class TeenNumberChecker {
    public static void main(String[] args) {

        System.out.println(hasTeen(9, 99, 19));  // should return true
        System.out.println(hasTeen(23, 15, 42));  // should return true
        System.out.println(hasTeen(22, 23, 34));  // should return false

        System.out.println(isTeen(9));  // should return false
        System.out.println(isTeen(13));  // should return true

    }

    public static boolean hasTeen(int x, int y, int z) {

        if (x >= 13 && x <= 19) {
            return true;
        } else if (y >= 13 && y <= 19) {
            return true;
        } else if (z >= 13 && z <= 19) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int x) {

        if (x >= 13 && x <= 19) {
            return true;
        } else {
            return false;
        }
    }
}
//
//We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
//
//        Write a method named hasTeen with 3 parameters of type int.
//
//        The method should return boolean and it needs to return true if one of the parameters is in
//        range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
//
//        * hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
//
//        * hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19
//
//
//        Write another method named isTeen with 1 parameter of type int.
//
//        The method should return boolean and it needs to return true if the parameter is in
//        range 13(inclusive) - 19 (inclusive). Otherwise return false.
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        * isTeen(9);  should return false since 9 is in not range 13 - 19
//
//        * isTeen(13);  should return true since 13 is in range 13 - 19
//
//        NOTE: All methods need to be defined as public static like we have been doing so far in the course.
//        NOTE: Do not add a  main method to solution code.
