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

    @Test
    public void condicionGanadoraDiagonal_ID() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(0, 0); // X juega en la posición (0, 0)
        ticTacToe.jugar(1, 1); // O juega en la posición (1, 1)
        ticTacToe.jugar(2, 2); // X juega en la posición (2, 2)
        boolean hayGanador = ticTacToe.jugar(1, 0); // O juega en la posición (1, 0) para ganar la diagonal superior izquierda a inferior derecha
        assertTrue(hayGanador); // Verificar que hay un ganador en la diagonal superior izquierda a inferior derecha
    }
    @Test
    public void condicionGanadoraDiagonal_DI() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(2, 0); // X juega en la posición (2, 0)
        ticTacToe.jugar(1, 1); // O juega en la posición (1, 1)
        ticTacToe.jugar(0, 2); // X juega en la posición (0, 2)
        boolean hayGanador = ticTacToe.jugar(1, 0); // O juega en la posición (1, 0) para ganar la diagonal inferior izquierda a superior derecha
        assertTrue(hayGanador); // Verificar que hay un ganador en la diagonal inferior izquierda a superior derecha
    }
    @Test
    public void manejoEmpate() {
        TicTacToe ticTacToe = new TicTacToe();

        // Llenar todas las casillas del tablero
        ticTacToe.jugar(0, 0);
        ticTacToe.jugar(0, 1);
        ticTacToe.jugar(0, 2);
        ticTacToe.jugar(1, 0);
        ticTacToe.jugar(1, 2);
        ticTacToe.jugar(1, 1);
        ticTacToe.jugar(2, 1);
        ticTacToe.jugar(2, 0);
        ticTacToe.jugar(2, 2);

        // Verificar que no haya ganador y sea un empate
        assertTrue(ticTacToe.hayEmpate());
    }






}
