package PruebasEspecificacion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static PruebasEspecificacion.stringUtils.substringsBetween;

public class stringUtilsTest {

        @Test
        public void testValidValues() {
            String[] expected = {"x", "y", "z"};
            assertArrayEquals(expected, substringsBetween("axcaycazc", "a", "c"));
        }

        @Test
        public void testEmptyString() {
            String[] expected = new String[0];
            assertArrayEquals(expected, substringsBetween("", "a", "c"));
        }

        @Test
        public void testNullString() {
            assertNull(substringsBetween(null, "a", "c"));
        }

        @Test
        public void testEmptyOpenClose() {
            assertNull(substringsBetween("axcaycazc", "", ""));
        }

        @Test
        public void testNullOpenClose() {
            assertNull(substringsBetween("axcaycazc", null, null));
        }

    }

