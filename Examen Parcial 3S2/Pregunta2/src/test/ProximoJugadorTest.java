import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProximoJugadorTest {
    @Test
    public void juegaprimeroX() {
        TicTacToe ticTacToe = new TicTacToe();
        assertEquals('X', ticTacToe.proximoJugador());
    }
}
