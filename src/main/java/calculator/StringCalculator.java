package calculator;

public class StringCalculator {

    private final String INVALID_FORMULA = "올바른 수식이 아닙니다.";

    public int calculate(String value) {
        String[] values = value.split(" ");

        int i = 0;
        int answer = str2int(values[i++]);

        while (i < values.length) {
            answer = operate(values[i++], answer, str2int(values[i++]));
        }

        return answer;
    }

    private int str2int(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            throw new IllegalArgumentException(INVALID_FORMULA);
        }
    }

    private int operate(String op, int a, int b) {
        if (op.equals("+")) {
            return plus(a, b);
        }

        if (op.equals("-")) {
            return minus(a, b);
        }

        if (op.equals("*")) {
            return multiple(a, b);
        }

        if (op.equals("/")) {
            return divide(a, b);
        }

        throw new IllegalArgumentException(INVALID_FORMULA);
    }

    private int plus(int a, int b) {
        return a + b;
    }

    private int minus(int a, int b) {
        return a - b;
    }

    private int multiple(int a, int b) {
        return a * b;
    }

    private int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException(INVALID_FORMULA);
        }
        return a / b;
    }
}
