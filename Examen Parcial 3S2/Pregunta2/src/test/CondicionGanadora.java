import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class CondicionGanadora {
    @Test
    public void porDefectoNoHayGanador() {
        TicTacToe ticTacToe = new TicTacToe();
        assertFalse(ticTacToe.jugar(1, 1));
    }
}
