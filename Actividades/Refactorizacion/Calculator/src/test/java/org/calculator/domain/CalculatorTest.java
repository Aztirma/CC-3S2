package org.calculator.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    private static Calculadora calculadora;

    @BeforeAll
    public static void init(){
        calculadora = new Calculadora();
    }

    @Test
    public void whenCalculatorInitializedThenReturnTrue() {
        assertTrue(calculadora.getStatus());
    }

    @Test
    public void whenAdditionTwoNumberThenReturnCorrectAnswer() {
        assertEquals( 5, calculadora.addition(2,3));
    }
    //Implementacion
    @Test
    public void whenSubtractingTwoNumbersThenReturnCorrectAnswer() {
        assertEquals(2,calculadora.subtraction(5, 3));
    }

    @Test
    public void whenDivisionThenReturnCorrectAnswer() {
        assertEquals(2, calculadora.division(8, 4));
    }

    /*
    @Test
    public void whenDivisionByZeroThenThrowException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.division(5, 0);
        });
        assertEquals("No se puede divisor por  cero", exception.getMessage());
    }*/

    //Ejercicio

    @Test
    public void whenMultiplyingTwoNumbersThenReturnCorrectAnswer() {
        assertEquals(15, calculadora.multiplication(5, 3));
    }

    @Test
    public void whenCalculatingSquareRootThenReturnCorrectAnswer() {
        assertEquals(5.0, calculadora.squareRoot(25), 0.0001);
    }


}
