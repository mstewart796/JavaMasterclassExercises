public class SwitchChallenge {

    public static void main(String[] args) {

        char letter = 'A';
        switch (letter) {
            case 'A' -> System.out.println("Able");
            case 'B' -> System.out.println("Baker");
            case 'C' -> System.out.println("Charlie");
            case 'D' -> System.out.println("Dog");
            case 'E' -> System.out.println("Easy");
            case 'F' -> System.out.println("Fox");
            case 'G' -> System.out.println("George");
            case 'H' -> System.out.println("How");
            case 'I' -> System.out.println("Item");
            case 'J' -> System.out.println("Jig");
            case 'K' -> System.out.println("King");
            case 'L' -> System.out.println("Love");
            case 'M' -> System.out.println("Mike");
            case 'N' -> System.out.println("Nan");
            case 'O' -> System.out.println("Oboe");
            case 'P' -> System.out.println("Peter");
            case 'Q' -> System.out.println("Queen");
            case 'R' -> System.out.println("Roger");
            case 'S' -> System.out.println("Sugar");
            case 'T' -> System.out.println("Tare");
            case 'U' -> System.out.println("Uncle");
            case 'V' -> System.out.println("Victor");
            case 'W' -> System.out.println("William");
            case 'X' -> System.out.println("X-ray");
            case 'Y' -> System.out.println("Yoke");
            case 'Z' -> System.out.println("Zebra");
            default -> System.out.println(letter + " was not found");
        }

    }
}
