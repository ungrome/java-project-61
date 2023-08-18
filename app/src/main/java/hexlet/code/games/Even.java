package hexlet.code.games;

public class Even {
    static final int MAX_RANDOM_VALUE = 100;
    public static String gameCode() {
        int number = (int) (Math.random() * MAX_RANDOM_VALUE);
        System.out.print("Question: ");
        System.out.println(number);
        String correctAnswer;
        correctAnswer = isEven(number) ? "yes" : "no";
        return correctAnswer;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static String gameTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}

