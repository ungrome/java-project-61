package hexlet.code.games;

public class GCD {
    static final int DIGIT_BOUNDARY = 20;
    public static String gameCode() {
        int result;
        int number1 = (int) (Math.random() * DIGIT_BOUNDARY + 1);
        int number2 = (int) (Math.random() * DIGIT_BOUNDARY + 1);
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
