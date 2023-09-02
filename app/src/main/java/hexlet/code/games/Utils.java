package hexlet.code.games;

import java.util.Random;

public class Utils {
    public static int getRandomInt(int minValue, int maxValue) {
        Random random = new Random();
        int diff = maxValue - minValue;
        return random.nextInt(diff + 1) + minValue;
    }
}
