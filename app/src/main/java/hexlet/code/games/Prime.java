package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
public class Prime {
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeGame() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("Answer 'yes' if the number is prime, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            int gameNumber = Engine.randomize();
            System.out.println("Question: " + gameNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String rightAnswer = isPrime(gameNumber) ? "yes" : "no";
            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                return;
            }
        }
        Engine.congratulations(userName);
        scanner.close();
    }
}
