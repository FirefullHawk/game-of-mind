package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static String[] getProgression(int firstMember, int arrayLength, int progressiveMember) {
        var arrayProgressive = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int nextMember = firstMember + progressiveMember * i;
            arrayProgressive[i] = Integer.toString(nextMember);
        }
        return arrayProgressive;
    }

    private static String[] generateRoundData() {
        var roundData = new String[Engine.GAME_ROUND - 1];

        final int firstMember = Utils.randomize();
        final int progressiveLength = Utils.randomize(5, 15);
        final int progressiveMember = Utils.randomize(1, 5);

        String[] arrayOfGame = getProgression(firstMember, progressiveLength, progressiveMember);

        int positionToHide = Utils.randomize(arrayOfGame.length);
        String rightAnswer = arrayOfGame[positionToHide];
        arrayOfGame[positionToHide] = "..";

        roundData[0] = "Question: " + String.join(" ", arrayOfGame);
        roundData[1] = rightAnswer;

        return roundData;
    }

    public static void progression() {
        var gameMatrix = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        String gameRule = "What number is missing in the progression?";

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            gameMatrix[i] = generateRoundData();
        }
        Engine.gameRun(gameRule, gameMatrix);
    }
}
