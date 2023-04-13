package hexlet.code.games;

import hexlet.code.Utils;

public class Progression {
    public static final String GAME_RULE = "What number is missing in the progression?";

    public static String[] getProgression(int firstMember, int arrayLength, int progressiveMember) {
        var arrayProgressive = new String[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            int nextMember = firstMember + progressiveMember * i;
            arrayProgressive[i] = Integer.toString(nextMember);
        }
        return arrayProgressive;
    }

    public static String[] generateRoundData() {
        var roundData = new String[2];

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
}
