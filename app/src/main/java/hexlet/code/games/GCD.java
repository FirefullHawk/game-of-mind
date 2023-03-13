package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class GCD {

    public static int getGCD(int num1, int num2) {
        return num2 == 0 ? num1 : getGCD(num2, num1 % num2);
    }
    public static void gcdGame() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {

            int gameNumber1 = Engine.randomize(1, 30);
            int gameNumber2 = Engine.randomize(1, 30);
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
