import org.junit.Test;
import static org.junit.Assert.*;

public class JugarTest {

    @Test(expected = RuntimeException.class)
    public void testJugarFueraDeLimitesX() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(5, 2);
    }
    @Test(expected = RuntimeException.class)
    public void testJugarFueraDeLimitesY() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(1, 5);
    }

    @Test(expected = RuntimeException.class)
    public void testJugarLugarOcupado() {
        TicTacToe ticTacToe = new TicTacToe();

        ticTacToe.jugar(1, 1);
        ticTacToe.jugar(1, 1); // Intentamos colocar otra pieza en la misma posición

        // Si se ejecuta correctamente hasta aquí, significa que no se lanzó la excepción
        fail("Se esperaba que se lanzara una RuntimeException por lugar ocupado.");
    }


}
