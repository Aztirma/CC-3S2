import org.junit.Test;
import static org.junit.Assert.*;

public class ValidacionJugarTest {
    //primera prueba
    @Test
    public void whenPiecePlacedOutsideXAxis_thenRuntimeExceptionIsThrown() {
        // Given
        TicTacToeGame game = new TicTacToeGame();

        // When
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            game.placePiece(2, 5);
        });

        // Then
        assertEquals("Invalid piece placement", exception.getMessage());
    }
}
