package hexlet.code;

public class Utils {
    public static int randomize() {
        int startRange = 0;
        final int endRange = 100;
        return startRange + (int) (Math.random() * endRange);
    }

    public static int randomize(int endRange) {
        int startRange = 0;
        return startRange + (int) (Math.random() * endRange);
    }

    public static int randomize(int startRange, int endRange) {
        return startRange + (int) (Math.random() * endRange);
    }
}

