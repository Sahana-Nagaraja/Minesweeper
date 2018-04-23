class GameEngine {

    private final String gridLayout;
    boolean hasFinished = false;
    int gridSize;

    void setHasFinished(boolean hasFinished) {
        this.hasFinished = hasFinished;
    }

    private Grid grid;

    GameEngine(String gridLayout) {
        grid = new Grid(gridLayout);
        this.gridLayout = gridLayout;
        gridSize = gridLayout.split(",").length;
    }


    void play() {
        do {
            System.out.println("\nEnter option : ");
            PlayerInput playerInput = new PlayerInput(new ConsoleInputReader().readSingleInput());
            grid.updateGrid(playerInput);
        }
        while (!hasFinished);
    }
}
