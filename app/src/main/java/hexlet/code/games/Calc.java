package hexlet.code.games;

public class Calc {
    static final int MIN_VALUE = 1;
    static final int MAX_VALUE = 20;
    static final String[] operators = new String[]{"+", "-", "*" };
    public static String gameCode() {
        int result;
        int number1 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        int number2 = Utils.getRandomInt(MIN_VALUE, MAX_VALUE);
        System.out.print("Question: ");
        result = operation(number1, number2);
        return String.valueOf(result);
    }

    public static int operation(int num1, int num2) {
        String operator = operators[Utils.getRandomInt(0, operators.length - 1)];
        switch (operator) {
            case "+" :
                System.out.println(num1 + " " + operator + " " + num2);
                return (num1 + num2);
            case "-" :
                System.out.println(num1 + " " + operator + " " + num2);
                return (num1 - num2);
            case "*" :
                System.out.println(num1 + " " + operator + " " + num2);
                return (num1 * num2);
            default:
                throw new IllegalArgumentException("operator choosing error");
        }
    }

    public static String gameTask() {
        return "What is the result of the expression?";
    }
 //   }
}
