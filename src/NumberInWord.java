public class NumberInWord {
    public static void main(String[] args) {

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(-1);
    }

    public static void printNumberInWord(int number) {

        switch(number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;





//        switch (number) {
//            case 0 -> System.out.println("ZERO");
//            case 1 -> System.out.println("ONE");
//            case 2 -> System.out.println("TWO");
//            case 3 -> System.out.println("THREE");
//            case 4 -> System.out.println("FOUR");
//            case 5 -> System.out.println("FIVE");
//            case 6 -> System.out.println("SIX");
//            case 7 -> System.out.println("SEVEN");
//            case 8 -> System.out.println("EIGHT");
//            case 9 -> System.out.println("NINE");
//            default -> System.out.println("OTHER");

        }
    }
}

//    Write a method called printNumberInWord. The method has one parameter number which is the whole number.
//    The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter
//    number is 0, 1, 2, .... 9 or other for any other number including negative numbers.
//    You can use if-else statement or switch statement whatever is easier for you.
//
//
//        NOTE: Method printNumberInWord needs to be public static for now, we are only using static methods.
//
//        NOTE: Do not add main method to solution code.