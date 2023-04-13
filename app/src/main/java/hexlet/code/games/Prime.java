package hexlet.code.games;

import hexlet.code.Utils;

public class Prime {
    public static final String GAME_RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] generateRoundData() {
        int gameNumber = Utils.randomize();
        String rightAnswer = isPrime(gameNumber) ? "yes" : "no";

        var roundData = new String[2];

        roundData[0] = "Question: " + gameNumber;
        roundData[1] = rightAnswer;

        return roundData;
    }
}
