import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ValidacionProximoJugador {
    @Test
    public void testFirstTurnShouldBeX() {
        TicTacToeGame game = new TicTacToeGame();
        char firstTurn = game.ProximoJugador();
        assertEquals('X', firstTurn);
    }
    @Test
    public void testTurnAfterXShouldBeO() {
        TicTacToeGame game = new TicTacToeGame();
        game.makeMove(0, 0);  // Jugada del jugador X
        char turnAfterX = game.ProximoJugador();
        assertEquals('O', turnAfterX);
    }

}
