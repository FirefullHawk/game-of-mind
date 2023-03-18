package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    public static void evenGame() {
        String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

        var roundInfo = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            int gameNumber = Utils.randomize();
            String rightAnswer = gameNumber % 2 == 0 ? "yes" : "no";

            roundInfo[i][0] = "Question: " + gameNumber;
            roundInfo[i][1] = rightAnswer;
        }
        Engine.gameRun(gameRule, roundInfo);
    }
}
