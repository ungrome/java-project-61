package hexlet.code.games;

public class Prime {
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 100;
    public static String gameCode() {
        int number = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        System.out.println("Question: " + number);
        String correctAnswer;
        correctAnswer = isPrime(number) ? "yes" : "no";
        return correctAnswer;
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
    public static String gameTask() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
