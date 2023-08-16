package hexlet.code;

import java.util.Scanner;
import hexlet.code.Cli;
import hexlet.code.games.Even;

public class Engine {
    static final int COUNT_CORRECT_ANSWER_TO_WIN = 3;
    static final int NUMBER_OF_ROUNDS = 3;

    public static void gameProcess() {
        Scanner s = new Scanner(System.in);
        boolean result = true;
        int countOfCorrectAnswer = 0;
        String correctAnswer = "";
        String lastAnswer = "";
        String lastCorrectAnswer = "";
        String usersAnswer = "";
        while ((countOfCorrectAnswer < NUMBER_OF_ROUNDS) && (result == true)) {
            correctAnswer = Even.gameCode();
            usersAnswer = s.next();

            result = checkAnswer(correctAnswer, usersAnswer);
            if (result == false) {
                lastAnswer = usersAnswer;
                lastCorrectAnswer = correctAnswer;
                break;
            } else countOfCorrectAnswer++;
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
//    public static boolean textToBoolean(String answer) {
//        return answer.equals("yes");
//    }
//
//    public static String booleanToText(boolean answer) {
//        return answer? "yes": "no";
//    }

//    public static int randomGenerator() {
//        return String.valueOf((int) (Math.random() * 100));
//    }
//}
