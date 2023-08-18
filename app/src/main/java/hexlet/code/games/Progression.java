package hexlet.code.games;

import java.util.Random;

public class Progression {
    static final int COUNT_OF_MEMBERS = 10;
    static final int MAX_INCREASE_VALUE = 6;
    static final int MAX_FIRST_MEMBER = 20;

    public static String gameCode() {
        Random random = new Random();
        int increase = random.nextInt(MAX_INCREASE_VALUE - 1) + 1;
        int[] members = new int[COUNT_OF_MEMBERS];
        int firstMember = random.nextInt(MAX_FIRST_MEMBER);
        // creating Array with progression members
        members[0] = firstMember;
        for (var i = 0; i < COUNT_OF_MEMBERS - 1; i++) {
            members[i + 1] = members[i] + increase;
        }
        //modify array with hidden number
        int hiddenMemberIndex = random.nextInt(COUNT_OF_MEMBERS);
        int hiddenMember = members[hiddenMemberIndex];
        System.out.print("Question:");
        for (var i = 0; i < COUNT_OF_MEMBERS; i++) {
            if (i == hiddenMemberIndex) {
                System.out.print(" " + "..");
            } else {
                System.out.print(" " + members[i]);
            }
        }
        System.out.println("");
        return String.valueOf(hiddenMember);
    }

    public static String gameTask() {
        return "What number is missing in the progression?";
    }
}
