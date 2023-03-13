package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Scanner;

public class Progression {

    public static void fillArray(String[] arrayToFill, int progressiveMember) {
        for (int i = 1; i < arrayToFill.length; i++) {
            int nextMember = Integer.parseInt(arrayToFill[0]) + progressiveMember * i;
            arrayToFill[i] = Integer.toString(nextMember);
        }
    }
    public static void progression() {
        Scanner scanner = new Scanner(System.in);

        String userName = Engine.greetingWithName();
        System.out.println("What number is missing in the progression?");

        for (int i = 0; i < 3; i++) {
            String[] arrayOfGame = new String[Engine.randomize(5, 15)];
            int progressiveMember = Engine.randomize(1, 5);
            arrayOfGame[0] = Integer.toString(Engine.randomize());

            fillArray(arrayOfGame, progressiveMember);

            int positionToHide = Engine.randomize(arrayOfGame.length);
            String rightAnswer = arrayOfGame[positionToHide];
            arrayOfGame[positionToHide] = "..";

            System.out.print("Question: ");
            System.out.println(String.join(" ", arrayOfGame));
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            String resultOfCompare = Engine.checkAnswer(userAnswer, rightAnswer, userName);

            if (resultOfCompare.equals("False")) {
                return;
            }
        }
        Engine.congratulations(userName);
        scanner.close();
    }
}
