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
    public void jugar(int row, int column) {
        validarLimitesTablero(row, column);
        validarLugarOcupado(row, column);
        realizarMovimiento(row, column);
        cambiarTurno();

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
}
