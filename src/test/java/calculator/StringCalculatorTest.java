package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void init() {
        stringCalculator = new StringCalculator();
    }

    @Test
    void calculate() {
        assertThat(stringCalculator.calculate("2 + 3 * 4 / 2"))
                .isEqualTo(10);
    }
}
