package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Arrays;

import static hexlet.code.Engine.NUMBER_OF_ROUNDS;

public class Progression {
    static final int COUNT_OF_MEMBERS = 10;
    static final int MIN_INCREASE_VALUE = 1;
    static final int MAX_INCREASE_VALUE = 6;
    static final int MAX_FIRST_MEMBER = 20;
    static final int MIN_FIRST_MEMBER = 1;
    static final String GAME_TASK = "What number is missing in the progression?";

    public static String[] generateRoundData() {
        String[] progressionAndRightAnswer = new String[2];
        String[] progression = createProgression();
        int hiddenMemberIndex = Utils.getRandomInt(0, COUNT_OF_MEMBERS - 1);
        String hiddenMember = progression[hiddenMemberIndex];
        for (var i = 0; i < COUNT_OF_MEMBERS; i++) {
            if (i == hiddenMemberIndex) {
                progression[i] = "..";
            }
        }
        progressionAndRightAnswer[0] = String.join(" ", progression);
        progressionAndRightAnswer[1] = hiddenMember;
        return progressionAndRightAnswer;
    }
    public static void runGame() {
        String[][] roundsData = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, GAME_TASK);
    }

    public static String[] createProgression() {
        int[] members = new int[COUNT_OF_MEMBERS];
        int increase = Utils.getRandomInt(MIN_INCREASE_VALUE, MAX_INCREASE_VALUE);
        int firstMember = Utils.getRandomInt(MIN_FIRST_MEMBER, MAX_FIRST_MEMBER);
        members[0] = firstMember;
        for (var i = 0; i < COUNT_OF_MEMBERS - 1; i++) {
            members[i + 1] = members[i] + increase;
        }
        return Arrays.stream(members)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);
    }
}

