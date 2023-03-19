package hexlet.code;

import java.util.Scanner;
public class Engine {

    public static final int GAME_ROUND = 3;

    public static void gameRun(String gameRules, String[][] gameMatrix) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(gameRules);

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            System.out.println(gameMatrix[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            boolean resultOfCompare = userAnswer.equalsIgnoreCase(gameMatrix[i][1]);
            System.out.println("Correct!");

            if (!resultOfCompare) {
                System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + gameMatrix[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        scanner.close();
    }
}
