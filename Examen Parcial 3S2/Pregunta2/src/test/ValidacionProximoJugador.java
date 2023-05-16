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
    @Test
    public void testTurnAfterOShouldBeX() {
        TicTacToeGame game = new TicTacToeGame();
        game.makeMove(0, 0);  // Jugada del jugador X
        game.makeMove(1, 1);  // Jugada del jugador O
        char turnAfterO = game.ProximoJugador();
        assertEquals('X', turnAfterO);
    }
}

