package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class GCD {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 100;
    static final String GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static String[] generateRoundData() {
        String[] numbersAndRightAnswer = new String[2];
        int result;
        int number1 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        int number2 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        result = findingGCD(number1, number2);
        numbersAndRightAnswer[0] = String.format("%d %d", number1, number2);
        numbersAndRightAnswer[1] = String.valueOf(result);
        return numbersAndRightAnswer;
    }

    public static int findingGCD(int num1, int num2) {
        int i;
        for (i = Math.min(num1, num2); i > 0; i--) {
            if ((num1 % i == 0) && (num2 % i == 0)) {
                break;
            }
        }
        return i;
    }
    public static void runGame() {
        String[][] roundsData = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, GAME_TASK);
    }
}

