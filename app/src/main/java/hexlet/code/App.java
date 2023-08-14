package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.\n"
                + "0 - Exit\n"
                + "1 - Greet\n"
                + "2 - Even\n");
        System.out.print("Your choice: ");
        String userChoice = s.next();

        switch (userChoice) {
            case "0" :
                break;
            case "1" :
                Cli.greeting();
                break;
            case "2" :
                String name = Cli.greeting();
                Even.start(name);
        }
        s.close();
    }
}
