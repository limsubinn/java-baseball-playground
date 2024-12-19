package calculator;

public class StringCalculator {

    public int calculate(String value) {
        String[] values = value.split(" ");

        int i = 0;
        int answer = Integer.parseInt(values[i++]);

        while (i < values.length) {
            if (values[i].equals("+")) {
                answer = plus(answer, Integer.parseInt(values[++i]));
                i++;
                continue;
            }

            if (values[i].equals("-")) {
                answer = minus(answer, Integer.parseInt(values[++i]));
                i++;
                continue;
            }

            if (values[i].equals("*")) {
                answer = multiple(answer, Integer.parseInt(values[++i]));
                i++;
                continue;
            }

            answer = divide(answer, Integer.parseInt(values[++i]));
            i++;
        }

        return answer;
    }

    private static int plus(int a, int b) {
        return a + b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int multiple(int a, int b) {
        return a * b;
    }

    private static int divide(int a, int b) {
        return a / b;
    }
}
