package org.calculator.domain;
public class Calculadora {
    private boolean status;
    public Calculadora() {
        this.status = true;
    }
    public boolean getStatus() {
        return status;
    }
    public int addition(int a, int b) {
        return a + b;
    }

    //Implementación de la función resta
    public int subtraction(int a, int b) {
        return a - b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        } else {
            return a / b;
        }
    }

    //Funciones agregadas
    public int multiplication(int a, int b) {
        return a * b;
    }

    public double squareRoot(double n) {
        if (n < 0) {
            throw new IllegalArgumentException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(n);
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double percentage(double percent, double number) {
        return percent / 100 * number;
    }
}
