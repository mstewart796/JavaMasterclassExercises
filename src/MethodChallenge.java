public class MethodChallenge {

    public static void main(String[] args) {

        displayHighScorePosition("Martin", calculateHighScorePosition(1500));
        displayHighScorePosition("John", calculateHighScorePosition(1000));
        displayHighScorePosition("Michael", calculateHighScorePosition(500));
        displayHighScorePosition("Stuart", calculateHighScorePosition(100));
        displayHighScorePosition("Tim", calculateHighScorePosition(25));

    }
    public static void displayHighScorePosition(String playerName, int highScorePosition) {

        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high" + " score list");
    }

    public static int calculateHighScorePosition(int playerScore) {

        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position =  2;
        } else if (playerScore >= 100) {
            position =  3;
        }
        return position;

    }

}

