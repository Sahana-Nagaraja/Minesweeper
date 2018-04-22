public class Grid {

    private static final int ROWS = 3;
    private static final int COLS = 3;

    private static final char[][] referenceGrid = new char[ROWS][COLS];
    private char[][] outputGrid = new char[ROWS][COLS];

    Grid(String gridLayout) {
        int k = 0;
        char[] charArr = gridLayout.replace(",", "").replace("\"", "").trim().toCharArray();
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                referenceGrid[x][y] = charArr[k++];
            }
        }
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                outputGrid[x][y] = 'x';
            }
        }
        displayOutputGrid();
    }

    public void displayOutputGrid() {
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                System.out.print(outputGrid[x][y]);
            }
            System.out.println();
        }
    }

    void replaceCharXWith0(int x, int y) {
        outputGrid[x][y] = '0';
        displayOutputGrid();
    }

    void replaceCharXWithf(int x, int y) {
        outputGrid[x][y] = 'f';
        displayOutputGrid();

    }

    char getOutputGridCoordinate(Coordinate coordinate) {
        return outputGrid[coordinate.getX()][coordinate.getY()];
    }

    void updateGrid(PlayerInput playerInput) {
        switch (playerInput.getChoice()) {
            case o:
                if (referenceGrid[playerInput.getX()][playerInput.getY()] == 'm') {
                    System.out.println("Game over. You stepped on a mine!");
                    GameEngine.setHasFinished(true);
                    break;
                } else
                    replaceCharXWith0(playerInput.getX(), playerInput.getY());
                break;
            case f:
                replaceCharXWithf(playerInput.getX(), playerInput.getY());
                break;
        }
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                if (outputGrid[x][y] == 'x') {

                    GameEngine.setHasFinished(false);
                    break;
                }
            }
        }
    }
}
