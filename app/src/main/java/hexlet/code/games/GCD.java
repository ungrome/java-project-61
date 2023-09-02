package hexlet.code.games;

public class GCD {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 100;
    public static String gameCode() {
        int result;
        int number1 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        int number2 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        System.out.println("Question: " + number1 + " " + number2);
        result = findingGCD(number1, number2);
        return String.valueOf(result);
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

    public static String gameTask() {
        return "Find the greatest common divisor of given numbers.";
    }
}
