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
    public static void calcGame() {

        String userName = Engine.greetingWithName();
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            final int setNumber = 30;
            int gameNumber1 = Utils.randomize(setNumber);
            int gameNumber2 = Utils.randomize(setNumber);
            String gameOperator = operationRandomize();
            System.out.println("Question: " + gameNumber1 + " " + gameOperator + " " + gameNumber2);
            System.out.print("Your answer: ");

            String userAnswer = Engine.getUserAnswer();

            String rightAnswer = Integer.toString(operationSwitch(gameNumber1, gameNumber2, gameOperator));
            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                return;
            }
        }
        Engine.congratulations(userName);
    }
}
