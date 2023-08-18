package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        Scanner s = new Scanner(System.in);
        System.out.println("May I have your name?");
        name = s.next();
        System.out.println("Hello, " + name + "!");
    }

    public static String getUserName() {
        return name;
    }
}
