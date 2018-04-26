class Grid {

    private static final int ROWS = 3;
    private static final int COLS = 3;

    private final Character[][] referenceGrid = new Character[ROWS][COLS];
    private final GameEngine gameEngine;
    private Character[][] outputGrid = new Character[ROWS][COLS];
    private ConsoleOutput consoleOutput = new ConsoleOutput();

    Grid(String gridLayout, GameEngine gameEngine) {
        int count = 0;
        this.gameEngine = gameEngine;
        char[] charArr = gridLayout.replace(",", "").replace("\"", "").trim().toCharArray();

        for (int x = 0; x < ROWS; x++) {
            count = loopReferenceCols(count, charArr, x);
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

    String displayOutputGrid() {
        StringBuilder result = new StringBuilder();
        for (int x = 0; x < ROWS; x++) {
            for (int y = 0; y < COLS; y++) {
                result.append(outputGrid[x][y]);
            }
            result.append("\n");
        }
        return result.toString();
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

        switch (playerInput.getChoice()) {
            case o:
                if (referenceGrid[playerInput.getX()][playerInput.getY()] == 'm') {
                    gameEngine.hasFinished("mine");
                } else
                    replaceCharXWith0(playerInput.getX(), playerInput.getY());
                break;
            case f:
                replaceCharXWithf(playerInput.getX(), playerInput.getY());
                break;
        }
        int xCount = getXCount();
        int flagCount = getFlagCount();
        int mineCount = getMineCount();
        if((flagCount == mineCount)&&(xCount==0)){
            gameEngine.hasFinished("clear");
        }
    }

    private int getFlagCount(){
        return getCount(outputGrid, 'f');
    }

    private int getMineCount(){
        return getCount(referenceGrid, 'm');
    }

    private int getXCount(){
        return getCount(outputGrid,'x');
    }

    private int getCount(Character[][] characters, Character c){
        int count = 0;
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
                if(characters[i][j] == c) count++;
            }
        }
        return count;
    }
}
