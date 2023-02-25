// create a method that sums the value of every digit in a number
public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {

        // if number is negative return -1
        if (number < 0) {
            return -1;
        }

        int sum = 0;
        // loop while number is above 0
        while (number > 0) {
            // use module to find last digit
            sum += (number % 10);
            // divide by ten to remove last digit
            number = number / 10;
        }
        return sum;
    }
}
