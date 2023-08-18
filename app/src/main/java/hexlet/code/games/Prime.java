package hexlet.code.games;

public class Prime {
    static final int MAX_RANDOM_VALUE = 100;
    public static String gameCode() {
        int number = (int) (Math.random() * MAX_RANDOM_VALUE);
        System.out.println("Question: " + number);
        String correctAnswer;
        correctAnswer = isPrime(number) ? "yes" : "no";
        return correctAnswer;
    }
    public static boolean isPrime(int number) {
        int i;
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
