package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
        scanner.close();
    }
}
