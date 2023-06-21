package PruebasEspecificacion;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;
public class NumberUtilsTest {

    @ParameterizedTest
    @MethodSource("testCases")
    void shouldAddNumbers(List<Integer> left, List<Integer> right, List<Integer> expected) {
        NumberUtils numberUtils = new NumberUtils();
        List<Integer> result = numberUtils.add(left, right);
        assertThat(result).isEqualTo(expected);
    }

    static Stream<Arguments> testCases() {
        return Stream.of(
                of(null, numbers(7,2), null),// T1: left null
                of(numbers(), numbers(), numbers()), // T2: left vacío
                of(numbers(7,2), null, null), // T3: right null
                of(numbers(), numbers(), numbers()), // T4: right vacío
                of(numbers(5), numbers(), numbers(5)), // T5: un solo dígito, sin aumento
                of(numbers(5), numbers(1), numbers(6)), // T6: un solo dígito, aumento
                of(numbers(1, 2, 3), numbers(), numbers(1, 2, 3)), // T7: sin aumento
                of(numbers(1, 2, 3), numbers(1,2,5), numbers(2, 4, 8)), // T8: aumento en el dígito menos significativo
                of(numbers(2,9,3), numbers(1,8,3), numbers(4,7,6)), // T9: aumento en el medio
                of(numbers(1, 2, 3), numbers(9, 8, 7), numbers(1, 1, 1, 0)), // T10: muchos aumentos
                of(numbers(1, 2, 3), numbers(0, 0, 9, 8, 7), numbers(1, 1, 1, 0)), // T11: muchos aumentos no seguidos
                of(numbers(0, 0, 9, 8, 7), numbers(1, 2, 3), numbers(1, 1, 1, 0)), // T12: aumento propagado a un dígito nuevo (ahora el más significativo)
                of(numbers(9), numbers(2), numbers(1, 1)), // T13: sin aumento (uno para left más largo que right)
                of(numbers(9, 9, 8), numbers(1, 7, 2), numbers(1, 1, 7, 0)), // T14: aumento en el dígito menos significativo (uno para left más largo que right)
                of(numbers(0, 9, 8), numbers(1, 0, 1), numbers(1, 9, 9)), // T15: aumento en el medio (uno para left más largo que right)
                of(numbers(1, 2, 3), numbers(9, 8, 7), numbers(1, 1, 1, 0)), // T16: muchos aumentos (uno para left más largo que right)
                of(numbers(1, 2, 3), numbers(0, 0, 9, 8, 7), numbers(1, 1, 1, 0)), // T17: muchos aumentos no seguidos (uno para left más largo que right)
                of(numbers(0, 0, 9, 8, 7), numbers(1, 2, 3), numbers(1, 1, 1, 0)), // T18: aumento propagado a un dígito nuevo (ahora el más significativo) (uno para left más largo que right)
                of(numbers(), numbers(), numbers()), // T19: sin aumento (right más larga a left)
                of(numbers(), numbers(), numbers()), // T20: con aumento (right más larga a left)
                of(numbers(9), numbers(2), numbers(1, 1))// T21: aumento a un nuevo dígito más significativo, por uno (como 99 + 1)
        );
    }

    static List<Integer> numbers(Integer... digits) {
        return new ArrayList<>(Arrays.asList(digits));
    }

}

