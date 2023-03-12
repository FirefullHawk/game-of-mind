package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
public class Even {
    public static void evenGame() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i <= 3; i++) {

            if (i == 3) {
                System.out.println("Congratulations, " + userName);
            }

            int gameNumber = Engine.randomize();
            System.out.println("Question: " + gameNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String rightAnswer = gameNumber % 2 == 0 ? "yes" : "no";
            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                break;
            }
        }
        scanner.close();
    }
}
