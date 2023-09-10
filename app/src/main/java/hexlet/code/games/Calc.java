package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Calc {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 20;
    static final String[] OPERATORS = new String[]{"+", "-", "*" };
    static final String GAME_TASK = "What is the result of the expression?";
    public static String[] generateRoundData() {
        String[] expressionAndRightAnswer = new String[2];
        int number1 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        int number2 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        String operator = OPERATORS[Utils.getRandomInt(0, OPERATORS.length - 1)];
        expressionAndRightAnswer[0] = String.format("%d %s %d", number1, operator, number2);
        expressionAndRightAnswer[1] = String.valueOf(calculation(number1, number2, operator));
        return expressionAndRightAnswer;
    }
    public static int calculation(int num1, int num2, String operator) {
        switch (operator) {
            case "+":
                return (num1 + num2);
            case "-":
                return (num1 - num2);
            case "*":
                return (num1 * num2);
            default:
                throw new IllegalArgumentException("operator choosing error");
        }
    }
    public static void runGame() {
        String[][] roundsData = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, GAME_TASK);
    }
}
