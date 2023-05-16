import org.junit.jupiter.api.Assertions;
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

    //Condicion ganadora 1
    @Test
    public void testHorizontalWinningCondition() {
        game.makeMove(0, 0); // X
        game.makeMove(1, 0); // O
        game.makeMove(0, 1); // X
        game.makeMove(1, 1); // O
        game.makeMove(0, 2); // X

        Assertions.assertEquals(TicTacToeGame.GameState.CROSS_WON, game.getGameState());
    }



}