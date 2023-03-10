import java.util.Scanner;

public class ReadingUserInputChallenge {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int counter = 1;
            double sum = 0;

            while (counter <= 5) {
                System.out.println("Enter number #" + counter + ":");
                String nextNumber = scanner.nextLine();
                try {
                    double number = Double.parseDouble(nextNumber);
                    sum += number;
                    counter++;
                } catch (NumberFormatException nfe) {
                    System.out.println("Invalid number");
                }
            }
            System.out.println("The sum of the five numbers is: " + sum);
        }

    }

// - Read 5 valid numbers from the user
// - print the sum
// - check they are valid
// - if not print "Invalid number"
// - "Enter number #x: "

