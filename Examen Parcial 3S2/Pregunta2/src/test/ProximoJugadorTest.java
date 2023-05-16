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

}
