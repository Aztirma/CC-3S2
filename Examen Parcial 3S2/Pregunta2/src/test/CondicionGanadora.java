import org.junit.Test;

public class CondicionGanadora {
    @Test
    public void noHayGanadorPorDefecto() {
        TicTacToe ticTacToe = new TicTacToe();
        assertFalse(ticTacToe.hayGanador());
    }
}
