import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProximoJugadorTest {
    @Test
    public void juegaprimeroX() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals('X', ticTacToe.proximoJugador());
    }
    @Test
    public void O_despuesde_X () {
        TicTacToe ticTacToe = new TicTacToe();

        assertEquals('X', ticTacToe.proximoJugador()); // Primer turno jugado por X
        ticTacToe.jugar(1, 1);
        assertEquals('O', ticTacToe.proximoJugador()); // Segundo turno jugado por O
    }

}
