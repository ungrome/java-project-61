package hexlet.code.games;

import hexlet.code.Engine;

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
        int increase = Utils.getRandomInt(MIN_INCREASE_VALUE, MAX_INCREASE_VALUE);
        int[] members = new int[COUNT_OF_MEMBERS];
        int firstMember = Utils.getRandomInt(MIN_FIRST_MEMBER, MAX_FIRST_MEMBER);
        // creating Array with progression members
        members[0] = firstMember;
        for (var i = 0; i < COUNT_OF_MEMBERS - 1; i++) {
            members[i + 1] = members[i] + increase;
        }
        //modify array with hidden number
        int hiddenMemberIndex = Utils.getRandomInt(0, COUNT_OF_MEMBERS - 1);
        int hiddenMember = members[hiddenMemberIndex];
        StringBuilder progressionLine = new StringBuilder();
        for (var i = 0; i < COUNT_OF_MEMBERS; i++) {
            if (i == hiddenMemberIndex) {
                progressionLine.append(" ").append("..");
            } else {
                progressionLine.append(" ").append(members[i]);
            }
        }
        String result = String.valueOf(hiddenMember);
        progressionAndRightAnswer[0] = progressionLine.toString();
        progressionAndRightAnswer[1] = result;
        return progressionAndRightAnswer;
    }
    public static void runGame() {
        String[][] roundsData = new String[NUMBER_OF_ROUNDS][2];
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            roundsData[i] = generateRoundData();
        }
        Engine.gameProcess(roundsData, GAME_TASK);
    }
}

