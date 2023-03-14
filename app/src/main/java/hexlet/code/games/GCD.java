package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class GCD {

    public static int getGCD(int num1, int num2) {
        return num2 == 0 ? num1 : getGCD(num2, num1 % num2);
    }
    public static void gcdGame() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            int setStart = 1;
            final int setMaxNumber = 30;
            int gameNumber1 = Utils.randomize(setStart, setMaxNumber);
            int gameNumber2 = Utils.randomize(setStart, setMaxNumber);
            System.out.println("Question: " + gameNumber1 + " " + gameNumber2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String rightAnswer = Integer.toString(getGCD(gameNumber1, gameNumber2));
            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                return;
            }
        }
        Engine.congratulations(userName);
        scanner.close();
    }
}
