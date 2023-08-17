package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "0 - Exit\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n");
        System.out.print("Your choice: ");
        String userChoice = s.next();

        switch (userChoice) {
            case "0" :
                break;
            case "1" :
                Cli.greeting();
                break;
            case "2" :
                Cli.greeting();
                System.out.println(Even.gameTask());
                Engine.gameProcess(userChoice);
                break;
            case "3" :
                Cli.greeting();
                System.out.println(Calc.gameTask());
                Engine.gameProcess(userChoice);
                break;
            case "4" :
                Cli.greeting();
                System.out.println(GCD.gameTask());
                Engine.gameProcess(userChoice);
                break;
            default:
        }
        s.close();
    }
}
