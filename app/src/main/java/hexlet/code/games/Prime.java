package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
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

    public static void primeGame() {
        String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        var roundInfo = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        for (int i = 0; i < Engine.GAME_ROUND; i++) {

            int gameNumber = Utils.randomize();

            String rightAnswer = isPrime(gameNumber) ? "yes" : "no";

            roundInfo[i][0] = "Question: " + gameNumber;
            roundInfo[i][1] = rightAnswer;
        }
        Engine.gameRun(gameRule, roundInfo);
    }
}
