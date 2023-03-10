import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        // call method to start
        inputThenPrintSumAndAverage();
//        tests on how Math.round work
//        long test =  Math.round(3.8);
//        System.out.println(test);

    }
    public static void inputThenPrintSumAndAverage() {
        // create scanner to gather input
        Scanner scanner = new Scanner(System.in);
        // create variables for the number, sum and counter
        int newNumber, sum = 0, counter = 0;
        // Math.round is a long
        long average = 0L;

        do {
            // request input
            // System.out.println("Enter a whole number (or anything else to quit): ");
            // take input
            String stringNumber = scanner.nextLine();
            // check if it is a valid int
            try {
                // cast string inputted (stringNumber) to int variable newNumber
                newNumber = Integer.parseInt(stringNumber);
                // add it to sum
                sum += newNumber;
                // increase counter
                counter++;
                // work out average (sum and counter are ints, therefore must be cast to doubles)
                average = Math.round((double) sum / (double) counter);
            } catch (NumberFormatException nfe) {
                // otherwise print sum / avg and break from loop
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        } while (true);
    }
}
//    Write a method called inputThenPrintSumAndAverage that does not have any parameters.
//
//        The method should not return anything (void) and it needs to keep reading int numbers
//        from the keyboard.
//
//        When the user enters something that is not an int then it needs to print a message in
//        the format
//        "SUM = XX AVG = YY".
//
//        XX represents the sum of all entered numbers of type int.
//        YY represents the calculated average of all numbers of type long.
//
//        EXAMPLES OF INPUT/OUTPUT:
//
//        EXAMPLE 1:
//
//        INPUT:
//
//        1
//        2
//        3
//        4
//        5
//        a
//
//        OUTPUT
//
//        SUM = 15 AVG = 3
//
//
//        EXAMPLE 2:
//
//        INPUT:
//
//        hello
//
//        OUTPUT:
//
//        SUM = 0 AVG = 0
//
//
//        TIP: Use Scanner to read an input from the user.
//
//        TIP: Use casting when calling the round method since it needs double as a parameter.
//
//        NOTE: Use the method Math.round to round the calculated average (double). The method
//        round returns long.
//
//        NOTE: Be mindful of spaces in the printed message.
//
//        NOTE: Be mindful of users who may type an invalid input right away (see example above).
//
//        NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been
//        doing so far in the course.
//
//        NOTE: Do not add the main method to the solution code.