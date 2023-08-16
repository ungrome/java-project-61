package hexlet.code;

import java.util.Scanner;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;

public class Engine {
    static final int COUNT_CORRECT_ANSWER_TO_WIN = 3;
    static final int NUMBER_OF_ROUNDS = 3;

    public static void gameProcess(String userChoice) {
        Scanner s = new Scanner(System.in);
        boolean result = true;
        int countOfCorrectAnswer = 0;
        String correctAnswer = "";
        String lastAnswer = "";
        String lastCorrectAnswer = "";
        String usersAnswer;
        while ((countOfCorrectAnswer < NUMBER_OF_ROUNDS) && result) {
            switch (userChoice) {
                case "2":
                    correctAnswer = Even.gameCode();
                    break;
                case "3":
                    correctAnswer = Calc.gameCode();
                    break;
                default:
            }
            usersAnswer = s.next();

            result = checkAnswer(correctAnswer, usersAnswer);
            if (!result) {
                lastAnswer = usersAnswer;
                lastCorrectAnswer = correctAnswer;
                break;
            } else {
                countOfCorrectAnswer++;
            }
        }
        resultAnnouncement(Cli.getUserName(), countOfCorrectAnswer, lastCorrectAnswer, lastAnswer);
    }

    public static boolean checkAnswer(String correctAnswer, String usersAnswer) {
        if (correctAnswer.equals(usersAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            return false;
        }
    }
    public static void resultAnnouncement(String userName, int countOfCorrectAnswer,
                                          String correctAnswer, String usersAnswer) {
        if (countOfCorrectAnswer == COUNT_CORRECT_ANSWER_TO_WIN) {
            System.out.println("Congratulations, " + userName + "!");
        } else {
            System.out.println("'" + usersAnswer + "'" + " is wrong answer ;(."
                    + "Correct answer was '" + correctAnswer + "'.\n"
                    + "Let's try again, " + userName + "!");
        }
    }
}
