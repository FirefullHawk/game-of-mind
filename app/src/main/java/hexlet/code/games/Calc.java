package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
public class Calc {
    public static void calcGame() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("What is the result of the expression?");

        for (int i = 0; i < 3; i++) {

            int gameNumber1 = Engine.randomize(30);
            int gameNumber2 = Engine.randomize(30);
            String gameOperator = Engine.operationRandomize();
            System.out.println("Question: " + gameNumber1 + " " + gameOperator + " " + gameNumber2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String rightAnswer = Integer.toString(Engine.operationSwitch(gameNumber1, gameNumber2, gameOperator));
            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName);
            }
        }
        scanner.close();
    }
}