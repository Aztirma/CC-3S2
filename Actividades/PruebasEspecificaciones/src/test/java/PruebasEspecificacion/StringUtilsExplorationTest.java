package PruebasEspecificacion;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
public class StringUtilsExplorationTest {

    //Pruebas realizadas en el paso2
    @Test
    void simpleCase() {
        assertThat(
                stringUtils.substringsBetween("abcd", "a", "d")
        ).isEqualTo(new String[] { "bc" });
    }
    @Test
    void manySubstrings() {
        assertThat(
                stringUtils.substringsBetween("abcdabcdad", "a", "d")
        ).isEqualTo(new String[] { "bc","bc",""});
    }
    @Test
    void openAndCloseTagsThatAreLongerThan1Char() {
        assertThat(
                stringUtils.substringsBetween("aabcddaabfddaab", "aa", "dd")
        ).isEqualTo(new String[] { "bc","bf"});
    }
}