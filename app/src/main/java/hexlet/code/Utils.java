package hexlet.code;

public class Utils {
    public static int randomize() {
        final int startRange = 0;
        final int endRange = 100;
        return randomize(startRange, endRange);
    }

    public static int randomize(int endRange) {
        final int startRange = 0;
        return randomize(startRange, endRange);
    }

    public static int randomize(int startRange, int endRange) {
        return startRange + (int) (Math.random() * endRange);
    }
}

