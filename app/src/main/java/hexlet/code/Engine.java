package hexlet.code;

import java.util.Scanner;
public class Engine {

    public static void startPage() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }

    public static String greetingWithName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        return userName;
    }

    public static void congratulations(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    public static int gameRound() {
        return +3;
    }
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

    public static int randomize() {
        int startRange = 0;
        int numberOrder = + 100;
        return startRange + (int) (Math.random() * numberOrder);
    }

    public static int randomize(int endRange) {
        int startRange = 0;
        return startRange + (int) (Math.random() * endRange);
    }

    public static int randomize(int startRange, int endRange) {
        return startRange + (int) (Math.random() * endRange);
    }

    public static String operationRandomize() {
        String chooser = Integer.toString(randomize(+3));
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
}
