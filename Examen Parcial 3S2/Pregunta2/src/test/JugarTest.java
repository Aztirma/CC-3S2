import org.junit.Test;
import static org.junit.Assert.*;

public class JugarTest {

    @Test(expected = RuntimeException.class)
    public void testJugarFueraDeLimites() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(5, 2);
    }

    @Test(expected = RuntimeException.class)
    public void testJugarFueraDeLimites2() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(0, 1);
    }

    @Test(expected = RuntimeException.class)
    public void testJugarFueraDeLimites3() {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.jugar(2, 4);
    }
}
