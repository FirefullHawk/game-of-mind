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

    private static String[] generateRoundData() {
        int gameNumber = Utils.randomize();
        String rightAnswer = isPrime(gameNumber) ? "yes" : "no";

        var roundData = new String[Engine.GAME_ROUND - 1];

        roundData[0] = "Question: " + gameNumber;
        roundData[1] = rightAnswer;

        return roundData;
    }


    public static void primeGame() {
        var gameMatrix = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        var gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            gameMatrix[i] = generateRoundData();
        }
        Engine.gameRun(gameRule, gameMatrix);
    }
}
