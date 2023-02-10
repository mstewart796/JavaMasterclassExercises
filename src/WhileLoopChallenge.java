// This challenge creates a method to check if a number is odd or even
// then we check numbers from 5 to 20 and print the even numbers
// we break after we've found 5 even numbers and print the total number of odd and even numbers

public class WhileLoopChallenge {
    public static void main(String[] args) {

        int number = 5;
        int counterEven = 0;
        int counterOdd = 0;
        while (number <= 20) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                counterEven++;
                if (counterEven == 5) {
                    System.out.println("We have found " + counterOdd + " odd and " + counterEven + " even numbers");
                    break;
                }
            } else {
                counterOdd++;
            }
            number++;
        }
    }
    public static boolean isEvenNumber(int number) {

        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
