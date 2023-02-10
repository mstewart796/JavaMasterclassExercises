// create a method that sums the value of every digit in a number
public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }

    public static int sumDigits(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number = number / 10;
        }
        return sum;
    }
}
