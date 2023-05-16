import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CondicionGanadora {
    @Test
    public void porDefectoNoHayGanador() {
        TicTacToe ticTacToe = new TicTacToe();
        assertFalse(ticTacToe.jugar(1, 1));
    }
    @Test
    public void condicionGanadoraHorizontal() {
        TicTacToe ticTacToe = new TicTacToe();

        // Jugador X ocupa la línea horizontal superior
        ticTacToe.jugar(0, 0); // X
        ticTacToe.jugar(1, 0); // O
        ticTacToe.jugar(0, 1); // X
        ticTacToe.jugar(1, 1); // O
        ticTacToe.jugar(0, 2); // X

        // Se espera que haya un ganador en la línea horizontal superior (jugador X)
        assertTrue(ticTacToe.jugar(1, 2));
    }

    @Test
    public void condicionGanadoraVertical() {
        TicTacToe ticTacToe = new TicTacToe();

        // Jugada de X
        ticTacToe.jugar(0, 0); // X
        ticTacToe.jugar(1, 0); // O
        ticTacToe.jugar(0, 1); // X
        ticTacToe.jugar(2, 0); // O
        ticTacToe.jugar(0, 2); // X

        // Se espera que haya una ganancia vertical para X
        assertTrue(ticTacToe.jugar(1, 2));
    }
}
