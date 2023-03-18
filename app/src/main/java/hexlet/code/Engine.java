package hexlet.code;

import java.util.Scanner;
public class Engine {

    public static String greetingWithName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static String getUserAnswer() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static void congratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static final int GAME_ROUND = 3;

    public static String checkAnswer(String userAnswer, String rightAnswer, String userName) {
        if (userAnswer.equalsIgnoreCase(rightAnswer)) {
            System.out.println("Correct!");
            return "Correct!";
        } else {
            System.out.print("'" + userAnswer + "'" + " is wrong answer ;(.");
            System.out.println(" Correct answer was " + "'" + rightAnswer + "'.");
            System.out.println("Let's try again, " + userName + "!");
            return "False";
        }
    }

    public static void gameRun(String gameRules, String[][] roundInfo) {
        String userName = Engine.greetingWithName();

        System.out.println(gameRules);

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            System.out.println(roundInfo[i][0]);
            System.out.print("Your answer: ");
            String userAnswer = getUserAnswer();

            String resultOfCompare = Engine.checkAnswer(userAnswer, roundInfo[i][1], userName);

            if (resultOfCompare.equals("False")) {
                return;
            }
        }
        congratulations(userName);
    }
}
