public class TicTacToe {
    public enum Cell {EMPTY, CROSS, NOUGHT}

    private static final int TOTALROWS = 3;
    private static final int TOTALCOLUMNS = 3;
    private char ultimoJugador;
    private Cell[][] grid;
    private char turn;

    public TicTacToe() {
        grid = new Cell[TOTALROWS][TOTALCOLUMNS];
        initBoard();
    }

    public void initBoard() {
        for (int row = 0; row < TOTALROWS; row++) {
            for (int column = 0; column < TOTALCOLUMNS; column++) {
                grid[row][column] = Cell.EMPTY;
            }
        }
        turn = 'X';
    }

    public int getTotalRows() {
        return TOTALROWS;
    }

    public int getTotalColumns() {
        return TOTALCOLUMNS;
    }

    public Cell getCell(int row, int column) {
        if (row >= 0 && row < TOTALROWS && column >= 0 && column < TOTALCOLUMNS) {
            return grid[row][column];
        } else {
            return null;
        }
    }

    public char getTurn() {
        return turn;
    }

    public void makeMove(int row, int column) {
        if (row >= 0 && row < TOTALROWS && column >= 0 && column < TOTALCOLUMNS && grid[row][column] == Cell.EMPTY) {
            grid[row][column] = (turn == 'X') ? Cell.CROSS : Cell.NOUGHT;
            turn = (turn == 'X') ? 'O' : 'X';
        }
    }
    public boolean jugar(int row, int column) {
        validarLimitesTablero(row, column);
        validarLugarOcupado(row, column);
        realizarMovimiento(row, column);
        return hayGanador();

    }
    private void validarLimitesTablero(int row, int column) {
        if (row < 0 || row >= TOTALROWS || column < 0 || column >= TOTALCOLUMNS) {
            throw new RuntimeException("Posición fuera de los límites del tablero.");
        }
    }
    private void validarLugarOcupado(int row, int column) {
        if (grid[row][column] != Cell.EMPTY) {
            throw new RuntimeException("Lugar ocupado.");
        }
    }
    private void realizarMovimiento(int row, int column) {
        grid[row][column] = (turn == 'X') ? Cell.CROSS : Cell.NOUGHT;
    }

    private void cambiarTurno() {
        turn = (turn == 'X') ? 'O' : 'X';
    }

    public char proximoJugador() {
        return turn;
    }
    private boolean hayGanador() {
        for (int i = 0; i < TOTALROWS; i++) {
            if (grid[i][0] == grid[i][1] && grid[i][1] == grid[i][2] && grid[i][0] != Cell.EMPTY) {
                return true; // Hay un ganador en una línea horizontal
            }
        }
        // Verificación de ganancia vertical
        for (int j = 0; j < TOTALCOLUMNS; j++) {
            if (grid[0][j] == grid[1][j] && grid[1][j] == grid[2][j] && grid[0][j] != Cell.EMPTY) {
                return true; // Hay una ganancia vertical
            }
        }
        // Verificar ganancia en diagonal superior izquierda a inferior derecha
        if (grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2] && grid[0][0] != Cell.EMPTY) {
            return true; // Hay un ganador en la diagonal superior izquierda a inferior derecha
        }
        // Verificar ganancia en diagonal inferior izquierda a superior derecha
        if (grid[2][0] == grid[1][1] && grid[1][1] == grid[0][2] && grid[2][0] != Cell.EMPTY) {
            return true; // Hay un ganador en la diagonal inferior izquierda a superior derecha
        }
        return false; // No hay ganador
    }
}
