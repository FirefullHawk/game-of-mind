package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;
import java.util.Arrays;
public class Progression {
    public static void progression() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < 3; i++) {
            String[] arrayOfGame = new String[Engine.randomize(5, 15)];
            int progressiveMember = Engine.randomize(1, 5);
            arrayOfGame[0] = Integer.toString(Engine.randomize());

            for (int j = 1; j < arrayOfGame.length; j++) {
                int nextMember = Integer.parseInt(arrayOfGame[0]) + progressiveMember * j;
                arrayOfGame[j] = Integer.toString(nextMember);
            }

            int positionToHide = Engine.randomize(arrayOfGame.length);
            String rightAnswer = arrayOfGame[positionToHide];
            arrayOfGame[positionToHide] = "**";

            System.out.println("Question: " + Arrays.toString(arrayOfGame));
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

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
