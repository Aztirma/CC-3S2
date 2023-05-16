import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProximoJugadorTest {
    @Test
    public void juegaprimeroX() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals('X', ticTacToe.proximoJugador());
    }
    @Test
    public void O_juega_despues_de_X() {
        TicTacToe ticTacToe = new TicTacToe();

        assertEquals('X', ticTacToe.proximoJugador()); // El primer turno es de X

        ticTacToe.jugar(1, 1); // X realiza su movimiento

        assertEquals('O', ticTacToe.proximoJugador()); // Después de X, el turno es de O

        ticTacToe.jugar(0, 0); // O realiza su movimiento
    }

    @Test
    public void X_despuesde_O() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals('X', ticTacToe.proximoJugador()); // El primer turno es jugado por X
        ticTacToe.jugar(1, 1); // O juega en una posición
        assertEquals('O', ticTacToe.proximoJugador()); // El próximo turno debe ser jugado por O
        ticTacToe.jugar(0, 0); // X juega en otra posición
        assertEquals('X', ticTacToe.proximoJugador()); // El siguiente turno debe ser jugado por X
    }



}
