package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Your choice: ");
        String userChoice = scanner.next();
        System.out.print("\n");

        switch (userChoice) {
            case "1":
                Cli.greeting();
                break;
            case "2":
                Even.evenGame();
                break;
            case "3":
                Calc.calcGame();
            case "0":
                break;
            default:
                System.out.println("Please, choose something else");
        }
        scanner.close();
    }
}
