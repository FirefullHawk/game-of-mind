package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Cli;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Engine.startPage();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        System.out.print("\n");

        switch (userChoice) {
            case "1" -> Cli.greeting();
            case "2" -> Even.evenGame();
            case "3" -> Calc.calcGame();
            case "4" -> GCD.gcdGame();
            case "5" -> Progression.progression();
            case "6" -> Prime.primeGame();
            case "0" -> {
                return;
            }
            default -> System.out.println("Please, choose something else");
        }
        scanner.close();
    }
}
