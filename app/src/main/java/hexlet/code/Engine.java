package hexlet.code;

public class Engine {
    public static int randomize() {
        int startRange = 0;
        int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    public static int randomize(int endRange) {
        int startRange = 0;
        return startRange + (int) (Math.random() * endRange);
    }

    public static String operationRandomize() {
        int chooser = randomize(10);
        return switch (chooser) {
            case 1, 2, 3 -> "-";
            case 4, 5, 6 -> "*";
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
