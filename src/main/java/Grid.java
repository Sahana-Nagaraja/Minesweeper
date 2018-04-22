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

    void replaceCharXWith0(Coordinate coordinate) {
        int x = coordinate.getX();
        int y = coordinate.getY();
        outputGrid[x][y] = '0';
        displayOutputGrid();
    }

    void replaceCharXWithf(Coordinate coordinate) {
        int x = coordinate.getX();
        int y = coordinate.getY();
        outputGrid[x][y] = 'f';
        displayOutputGrid();

    }

    char getOutputGridCoordinate(Coordinate coordinate) {
        int x = coordinate.getX();
        int y = coordinate.getY();
        return outputGrid[x][y];
    }
}
