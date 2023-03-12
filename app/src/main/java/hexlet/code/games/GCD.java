package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GCD {
    public static void gcdGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Find the greatest common divisor of given numbers.");

        for (int i = 0; i < 3; i++) {

            int gameNumber1 = Engine.randomize(1, 30);
            int gameNumber2 = Engine.randomize(1, 30);
            System.out.println("Question: " + gameNumber1 + " " + gameNumber2);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            int rightAnswer = Engine.getGCD(gameNumber1, gameNumber2);
            String compare = userAnswer.equalsIgnoreCase(Integer.toString(rightAnswer)) ? "Correct!" : userAnswer;

            if (compare.equals("Correct!")) {
                System.out.println(compare);
            } else {
                System.out.print("'" + compare + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName);
            }
        }
        scanner.close();
    }
}
