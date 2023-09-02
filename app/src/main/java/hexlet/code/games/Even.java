package hexlet.code.games;

public class Even {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 100;
    public static String gameCode() {
        int number = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
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

