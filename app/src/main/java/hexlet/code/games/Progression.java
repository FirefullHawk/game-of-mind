package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static void fillArray(String[] arrayToFill, int progressiveMember) {
        for (int i = 1; i < arrayToFill.length; i++) {
            int nextMember = Integer.parseInt(arrayToFill[0]) + progressiveMember * i;
            arrayToFill[i] = Integer.toString(nextMember);
        }
    }
    public static void progression() {
        String gameRule = "What number is missing in the progression?";

        var roundInfo = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            final int minRangeArray = 5;
            final int maxRangeArray = 15;
            final int maxProgressiveNumber = 5;

            String[] arrayOfGame = new String[Utils.randomize(minRangeArray, maxRangeArray)];
            int progressiveMember = Utils.randomize(maxProgressiveNumber);
            arrayOfGame[0] = Integer.toString(Utils.randomize());

            fillArray(arrayOfGame, progressiveMember);

            int positionToHide = Utils.randomize(arrayOfGame.length);
            String rightAnswer = arrayOfGame[positionToHide];
            arrayOfGame[positionToHide] = "..";

            roundInfo[i][0] = "Question: " + String.join(" ", arrayOfGame);
            roundInfo[i][1] = rightAnswer;
        }
        Engine.gameRun(gameRule, roundInfo);
    }
}
