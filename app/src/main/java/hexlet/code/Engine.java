package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_ROUNDS = 3;

    public static void gameProcess(String[][] roundsData, String task) {
        Scanner s = new Scanner(System.in);
        System.out.println(task);
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            System.out.print("Question: " + roundsData[i][0] + "\nYour answer: ");
            String usersAnswer = s.next();
            if (usersAnswer.equals(roundsData[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!",
                        usersAnswer, roundsData[i][1], Cli.getUserName());
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getUserName() + "!");
    }
}

