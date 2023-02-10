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
