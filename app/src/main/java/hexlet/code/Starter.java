package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;


public class Starter {

    public static String gameRule(String gameChosen) {
        return switch (gameChosen) {
            case "2" -> Even.GAME_RULE;
            case "3" -> Calc.GAME_RULE;
            case "4" -> GCD.GAME_RULE;
            case "5" -> Progression.GAME_RULE;
            case "6" -> Prime.GAME_RULE;
            default -> null;
        };
    }
    public static void gameFormer(String numberOfTheGame) {
        var gameMatrix = new String[Engine.GAME_ROUND][];

        for (int i = 0; i < Engine.GAME_ROUND; i++) {
            gameMatrix[i] = switch (numberOfTheGame) {
                case "2" -> Even.generateRoundData();
                case "3" -> Calc.generateRoundData();
                case "4" -> GCD.generateRoundData();
                case "5" -> Progression.generateRoundData();
                case "6" -> Prime.generateRoundData();
                default -> null;
            };
        }

        Engine.gameRun(gameRule(numberOfTheGame), gameMatrix);
    }
}
