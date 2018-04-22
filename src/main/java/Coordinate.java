public class Coordinate {
    private int x;
    private int y;
    Grid grid;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    void updateGrid(InputChoice inputChoice) {
        switch (inputChoice) {
            case o:
                grid.replaceCharXWith0(new Coordinate(this.x, this.y));
                break;
            case f:
                grid.replaceCharXWithf(new Coordinate(this.x, this.y));
                break;
        }
    }

}
