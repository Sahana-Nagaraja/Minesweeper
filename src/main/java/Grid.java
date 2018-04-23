public class Grid {

    private final int ROWS = 3;
    private final int COLS = 3;

    private final Character[][] referenceGrid = new Character[ROWS][COLS];
    private final String gridLayout;
    private Character[][] outputGrid = new Character[ROWS][COLS];
    ConsoleOutput consoleOutput = new ConsoleOutput();

    Grid(String gridLayout) {
        int k = 0;
        this.gridLayout = gridLayout;
        char[] charArr = gridLayout.replace(",", "").replace("\"", "").trim().toCharArray();

        for (int x = 0; x < ROWS; x++) {
            k = loopReferenceCols(k, charArr, x);
        }
        for (int x = 0; x < ROWS; x++) {
            loopOutputCols(x);
        }
    }

    private void loopOutputCols(int x) {
        for (int y = 0; y < COLS; y++) {
            outputGrid[x][y] = 'x';
        }
    }

    private int loopReferenceCols(int k, char[] charArr, int x) {
        for (int y = 0; y < COLS; y++) {
            referenceGrid[x][y] = charArr[k++];
        }
        return k;
    }

    public String displayOutputGrid() {
        String result = "";
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                result += outputGrid[x][y];
            }
            result += "\n";
        }
        return result;
    }

    char getOutputGridCoordinate(Coordinate coordinate) {
        return outputGrid[coordinate.getX()][coordinate.getY()];
    }

    private void replaceCharXWith0(int x, int y) {
        outputGrid[x][y] = '0';
        consoleOutput.display(displayOutputGrid());
    }

    private void replaceCharXWithf(int x, int y) {
        outputGrid[x][y] = 'f';
        consoleOutput.display(displayOutputGrid());
    }

    void updateGrid(PlayerInput playerInput) {

        GameEngine gameEngine = new GameEngine(gridLayout);
        switch (playerInput.getChoice()) {
            case o:
                if (referenceGrid[playerInput.getX()][playerInput.getY()] == 'm') {
                    System.out.println("Game over. You stepped on a mine!");
                    gameEngine.setHasFinished(true);
                    break;
                } else
                    replaceCharXWith0(playerInput.getX(), playerInput.getY());
                break;
            case f:
                replaceCharXWithf(playerInput.getX(), playerInput.getY());
                break;
        }

        for (int x = 0; x < ROWS; x++) {
            if (loopCols(gameEngine, outputGrid[x])) return;
        }
    }

    private boolean loopCols(GameEngine gameEngine, Character[] characters) {
        for (int y = 0; y < COLS; y++) {
            if (characters[y] == 'x') {
                gameEngine.setHasFinished(false);
                return true;
            }
        }
        return false;
    }
}
