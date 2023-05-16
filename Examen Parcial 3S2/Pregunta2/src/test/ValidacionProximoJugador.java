import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidacionProximoJugador {
    @Test
    public void testFirstTurnShouldBeX() {
        TicTacToeGame game = new TicTacToeGame();
        char firstTurn = game.ProximoJugador();
        assertEquals('X', firstTurn);
    }
}
