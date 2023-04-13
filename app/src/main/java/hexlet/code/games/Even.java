package hexlet.code.games;

import hexlet.code.Utils;

public class Even {
    public static final String GAME_RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String[] generateRoundData() {
        var roundData = new String[2];

        int gameNumber = Utils.randomize();
        String rightAnswer = isEven(gameNumber) ? "yes" : "no";

        roundData[0] = "Question: " + gameNumber;
        roundData[1] = rightAnswer;
        return roundData;
    }
}
