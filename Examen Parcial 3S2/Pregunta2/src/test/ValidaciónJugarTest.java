import org.junit.Test;
import static org.junit.Assert.*;
public class ValidaciónJugarTest {
    //primera prueba
    @Test
    public void whenPiecePlacedOutsideXAxis_thenRuntimeExceptionIsThrown() {
        // Given
        TicTacToeGame game = new TicTacToeGame();

        // When
        Throwable exception = assertThrows(RuntimeException.class, () -> {
            game.Jugar(1, 3);
        });

        // Then
        assertEquals("Invalid piece placement", exception.getMessage());
    }


}
