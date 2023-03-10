package hexlet.code;
import java.util.Scanner;
public class Even {

    public static int randomize() {

        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }
    public static void evenGame() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {

            int gameNumber = randomize();
            System.out.println("Question: " + gameNumber);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String rightAnswer = gameNumber % 2 == 0 ? "yes" : "no";
            String compare = userAnswer.equalsIgnoreCase(rightAnswer) ? "Correct!" : userAnswer;

            if (!compare.equals("Correct!")) {
                System.out.print("'" + compare + "'" + " is wrong answer ;(.");
                System.out.println(" Correct answer was " + "'" + rightAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }

            if (i == 2) {
                System.out.println("Congratulations, " + userName);
            }
        }
    }
}
