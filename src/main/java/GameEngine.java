public class GameEngine {

    private final String gridLayout;
    public static boolean hasFinished = false;
    public static int gridSize;

    public static void setHasFinished(boolean hasFinished) {
        GameEngine.hasFinished = hasFinished;
    }

    public static void setGridSize(int gridSize) {
        GameEngine.gridSize = gridSize;
    }
    Grid grid;

    public GameEngine(String gridLayout) {
        grid = new Grid(gridLayout);
        this.gridLayout = gridLayout;
        gridSize = gridLayout.split(",").length;
        GameEngine.setGridSize(gridSize);
    }


    public void play() {
        do {
            System.out.println("\nEnter option : ");
            PlayerInput playerInput = new PlayerInput(new ConsoleInputReader().readSingleInput());
            grid.updateGrid(playerInput);
        }
        while (!hasFinished);
    }
}
