public class GameEngine {

    private final String gridLayout;
    private boolean hasFinished = false;
    public static int gridSize;

    public GameEngine(String gridLayout) {
        this.gridLayout = gridLayout;
        this.gridSize = gridLayout.split(",").length;
    }


    public void play() {
        do {
            System.out.println("Enter option : ");
            PlayerInput playerInput = new PlayerInput(new ConsoleInputReader().readSingleInput());
            InputChoice choice = playerInput.getChoice();
            int x = playerInput.getX();
            int y = playerInput.getY();
            hasFinished = true;
        }

        while (!hasFinished);
    }
}
