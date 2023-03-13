package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
public class Calc {
    public static void calcGame() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < Engine.gameRound(); i++) {
            int setNumber = 30;
            int gameNumber1 = Engine.randomize(setNumber);
            int gameNumber2 = Engine.randomize(setNumber);
            String gameOperator = Engine.operationRandomize();
            System.out.println("Question: " + gameNumber1 + " " + gameOperator + " " + gameNumber2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String rightAnswer = Integer.toString(Engine.operationSwitch(gameNumber1, gameNumber2, gameOperator));
            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                return;
            }
        }
        Engine.congratulations(userName);
        scanner.close();
    }
}
