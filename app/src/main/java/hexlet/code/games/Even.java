package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Even {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 100;
    static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void runGame() {
        String[][] roundsData = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, GAME_TASK);
    }
    public static String[] generateRoundData() {
        String[] taskNumberAndRightAnswer = new String[2];
        int number = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        String correctAnswer = isEven(number) ? "yes" : "no";
        taskNumberAndRightAnswer[0] = String.format("%d", number);
        taskNumberAndRightAnswer[1] = correctAnswer;
        return taskNumberAndRightAnswer;
    }
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
}


