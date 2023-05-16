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

    public boolean esGanador(int row, int column) {
        Cell player = grid[row][column];
        // Verificar línea horizontal
        boolean horizontalWin = true;
        for (int col = 0; col < TOTALCOLUMNS; col++) {
            if (grid[row][col] != player) {
                horizontalWin = false;
                break;
            }
        }
        if (horizontalWin) {
            return true;
        }
        // Verificar línea vertical
        boolean verticalWin = true;
        for (int r = 0; r < TOTALROWS; r++) {
            if (grid[r][column] != player) {
                verticalWin = false;
                break;
            }
        }
        if (verticalWin) {
            return true;
        }
        // Verificar diagonales
        if (row == column || row + column == TOTALROWS - 1) {
            boolean diagonalWin = true;
            for (int i = 0; i < TOTALROWS; i++) {
                if (grid[i][i] != player && grid[i][TOTALROWS - 1 - i] != player) {
                    diagonalWin = false;
                    break;
                }
            }
            if (diagonalWin) {
                return true;
            }
        }
        return false;
    }
    public boolean hayEmpate() {
        for (int row = 0; row < TOTALROWS; row++) {
            for (int col = 0; col < TOTALCOLUMNS; col++) {
                if (grid[row][col] == Cell.EMPTY || esGanador(row, col)) {
                    return false; // Todavía hay casillas vacías o hay un ganador, no hay empate
                }
            }
        }
        return true; // Todas las casillas están ocupadas y no hay ganador, hay empate
    }
    private boolean hayGanador() {
        return esGanador(int row, int column);
    }
}
