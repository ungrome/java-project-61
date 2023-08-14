package hexlet.code.games;

import java.util.Scanner;

public class Even {
    public static void start(String name) {
        Scanner s = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var roundsDone = 0 ;
        boolean correctAnswer;
        boolean answer;
        boolean result = true;
        int numberOfRounds = 3;
        int countOfCorrectAnswer = 0;
        int countOfCorrectAnswerToWin = 3;
        while (roundsDone < numberOfRounds && result) {

            System.out.print("Question: ");
            int number = randomGenerator();
            System.out.println(number);
            correctAnswer = isEven(number);
            String input = s.next();

            if (!input.equals("yes") && !input.equals("no")) {
                System.out.println("Error! Please, check your answer, " + name + ". "
                        + "It should be 'yes', or 'no'");
                //roundsDone--;
                continue;
            }
            answer = textToBoolean(input);
            if (correctAnswer == answer) {
                System.out.println("Correct!");
                result = true;
                countOfCorrectAnswer++;
            } else {
                System.out.println("'" + booleanToText(answer) + "'" + " is wrong answer ;(."
                        + "Correct answer was '" + booleanToText(!answer) + "'.\n"
                        + "Let's try again, " +  name + "!");
                result = false;
            }
            roundsDone++;
        }
        if (countOfCorrectAnswer == countOfCorrectAnswerToWin) {
            System.out.println("Congratulations, " + name + "!");
        }
    }

    public static int randomGenerator() {
        return (int) (Math.random() * 100);
    }
    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }
    public static boolean textToBoolean(String answer) {
        return answer.equals("yes");
    }

    public static String booleanToText(boolean answer) {
        return answer? "yes": "no";
    }
}

