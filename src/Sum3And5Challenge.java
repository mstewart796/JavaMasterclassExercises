public class Sum3And5Challenge {

    public static void main(String[] args) {

        int sum = 0;
        int count = 0;

        // we will iterate through numbers from 1 to 1000 and sum all numbers that
        // are evenly divisible by both 3 and 5
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number " + i + " can be divided by both 3 and 5");
                sum += i;
                count++;
                // we will quit once we reach 5 matches
                if (count == 5) {
                    break;
                }
            }
        }

        System.out.println("The total sum of all the above numbers is: " + sum);
    }
}
