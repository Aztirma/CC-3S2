import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class ValidacionCondicionesGanadoras {
    private TicTacToeGame game;

    @BeforeEach
    public void setUp() {
        game = new TicTacToeGame();
    }

    @Test
    public void testDefaultGameStateIsPlaying() {
        assertEquals(TicTacToeGame.GameState.PLAYING, game.getGameState());
    }

    @Test
    public void testNoWinnerByDefault() {
        assertEquals(TicTacToeGame.GameState.PLAYING, game.getGameState());
    }
}