package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    public static String operationRandomize() {
        final int numOfOperation = 3;
        String chooser = Integer.toString(Utils.randomize(numOfOperation));
        return switch (chooser) {
            case "1" -> "-";
            case "2" -> "*";
            default -> "+";
        };
    }

    public static int operationSwitch(int firstNumber, int secondNumber, String operation) {
        return switch (operation) {
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            default -> firstNumber + secondNumber;
        };
    }

    private static String[] generateRoundData() {
        var roundData = new String[Engine.GAME_ROUND - 1];

        final int setDifficult = 30;
        int gameNumber1 = Utils.randomize(setDifficult);
        int gameNumber2 = Utils.randomize(setDifficult);
        String gameOperator = operationRandomize();

        String rightAnswer = Integer.toString(operationSwitch(gameNumber1, gameNumber2, gameOperator));

        roundData[0] = "Question: " + gameNumber1 + " " + gameOperator + " " + gameNumber2;
        roundData[1] = rightAnswer;
        return roundData;
    }

    public static void calcGame() {
        var gameMatrix = new String[Engine.GAME_ROUND][Engine.GAME_ROUND - 1];

        String gameRule = "What is the result of the expression?";

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            gameMatrix[i] = generateRoundData();
        }
        Engine.gameRun(gameRule, gameMatrix);
    }
}
