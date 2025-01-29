package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void init() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void calculate1() {
        assertThat(stringCalculator.calculate("2 + 3 * 4 / 2"))
                .isEqualTo(10);
    }

    @Test
    void calculate2() {
        assertThat(stringCalculator.calculate("2 + 3 - 1 * 4 / 4"))
                .isEqualTo(4);
    }

    @Test
    void calculate3() {
        assertThrows(IllegalArgumentException.class,
                () -> stringCalculator.calculate("1 + 2 / 0"));
    }

    @Test
    void calculate4() {
        assertThrows(IllegalArgumentException.class,
                () -> stringCalculator.calculate("+ 1"));
    }
}
