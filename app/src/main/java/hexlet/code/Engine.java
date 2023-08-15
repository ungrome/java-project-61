package hexlet.code;

import hexlet.code.games.Even;

import static hexlet.code.games.Even;

public class Engine {

   public static gameProcess() {
       System.out.println(Even.gameTask());
   }

    public static int randomGenerator() {
        return (int) (Math.random() * 100);
    }

    public static boolean textToBoolean(String answer) {
        return answer.equals("yes");
    }

    public static String booleanToText(boolean answer) {
        return answer? "yes": "no";
    }
}
