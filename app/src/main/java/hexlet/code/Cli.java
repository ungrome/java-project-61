package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static String name;

    public static String getUserName() {
        return name;
    }
    public static String greeting() {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.println("What is your name?");
        String name = s.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }

}
