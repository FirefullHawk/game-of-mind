package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static int getGCD(int num1, int num2) {
        return num2 == 0 ? num1 : getGCD(num2, num1 % num2);
    }

    private static String[] generateRoundData() {
        var roundData = new String[Engine.GAME_ROUND - 1];

        final int setStartNumber = 1;
        final int setMaxNumber = 30;
        int gameNumber1 = Utils.randomize(setStartNumber, setMaxNumber);
        int gameNumber2 = Utils.randomize(setStartNumber, setMaxNumber);
        String rightAnswer = Integer.toString(getGCD(gameNumber1, gameNumber2));

        roundData[0] = "Question: " + gameNumber1 + " " + gameNumber2;
        roundData[1] = rightAnswer;
        return roundData;
    }

    public static void gcdGame() {
        var gameMatrix = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        var gameRule = "Find the greatest common divisor of given numbers.";

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            gameMatrix[i] = generateRoundData();
        }

        Engine.gameRun(gameRule, gameMatrix);
    }
}
