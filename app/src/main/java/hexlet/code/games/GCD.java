package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    public static int getGCD(int num1, int num2) {
        return num2 == 0 ? num1 : getGCD(num2, num1 % num2);
    }
    public static void gcdGame() {
        String gameRule = "Find the greatest common divisor of given numbers.";

        var roundInfo = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            final int setStart = 1;
            final int setMaxNumber = 30;
            int gameNumber1 = Utils.randomize(setStart, setMaxNumber);
            int gameNumber2 = Utils.randomize(setStart, setMaxNumber);
            String rightAnswer = Integer.toString(getGCD(gameNumber1, gameNumber2));

            roundInfo[i][0] = "Question: " + gameNumber1 + " " + gameNumber2;
            roundInfo[i][1] = rightAnswer;
        }
        Engine.gameRun(gameRule, roundInfo);
    }
}
