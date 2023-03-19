package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static String[] generateRoundData() {
        int gameNumber = Utils.randomize();
        String rightAnswer = isEven(gameNumber) ? "yes" : "no";

        var roundData = new String[Engine.GAME_ROUND - 1];

        roundData[0] = "Question: " + gameNumber;
        roundData[1] = rightAnswer;
        return roundData;
    }

    public static void evenGame() {
        var gameMatrix = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            gameMatrix[i] = generateRoundData();
        }
        Engine.gameRun(gameRule, gameMatrix);
    }
}
