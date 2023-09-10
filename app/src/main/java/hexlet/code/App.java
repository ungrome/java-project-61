package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static final int EVEN_GAME = 2;
    public static final int CALC_GAME = 3;
    public static final int GCD_GAME = 4;
    public static final int PROGRESSION_GAME = 5;
    public static final int PRIME_GAME = 6;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "0 - Exit\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n");
        System.out.print("Your choice: ");
        int userChoice = s.nextInt();

        switch (userChoice) {
            case 0 :
                break;
            case 1 :
                Cli.greeting();
                break;
            case EVEN_GAME :
                Cli.greeting();
                Even.runGame();
                break;
            case CALC_GAME :
                Cli.greeting();
                Calc.runGame();
                break;
            case GCD_GAME :
                Cli.greeting();
                GCD.runGame();
                break;
            case PROGRESSION_GAME :
                Cli.greeting();
                Progression.runGame();
                break;
            case PRIME_GAME :
                Cli.greeting();
                Prime.runGame();
                break;
            default:
        }
        s.close();
    }
}
