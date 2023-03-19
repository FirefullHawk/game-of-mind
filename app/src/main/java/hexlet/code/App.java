package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

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
                System.out.println("You're out. If you want to start over, use the 'make run-dist' command.");
                return;
            }
            default -> System.out.println("Please, choose something else");
        }
        scanner.close();
    }
}
