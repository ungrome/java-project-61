package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Prime {
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 100;
    static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static String[] generateRoundData() {
        String[] numberAndRightAnswer = new String[2];
        int number = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        String correctAnswer;
        correctAnswer = isPrime(number) ? "yes" : "no";
        numberAndRightAnswer[0] = String.format("%d", number);
        numberAndRightAnswer[1] = correctAnswer;
        return numberAndRightAnswer;
    }

    public static boolean isPrime(int number) {
        int i;
        if (number == 0 || number == 1) {
            return false;
        }
        for (i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void runGame() {
        String[][] roundsData = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, GAME_TASK);
    }
}
