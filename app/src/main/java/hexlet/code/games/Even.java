package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static String gameCode() {
            int number = (int) (Math.random() * 100);
            System.out.print("Question: ");
            System.out.println(number);
            String correctAnswer = "";
            correctAnswer = isEven(number)? "yes": "no";
            return correctAnswer;
            //            if (!input.equals("yes") && !input.equals("no")) {
//                System.out.println("Error! Please, check your answer, " + Cli.getUserName() + ". "
//                        + "It should be 'yes', or 'no'");
//                continue;
    }

    public static boolean isEven(int number) {
        return (number % 2 == 0);
    }

    public static String gameTask() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}

