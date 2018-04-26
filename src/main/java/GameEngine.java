class GameEngine {

    private Grid grid;
    private ConsoleOutput consoleOutput = new ConsoleOutput();

     private void setHasCompleted() {
        this.hasCompleted = true;
    }

    boolean getHasCompleted() {
        return hasCompleted;
    }

    private boolean hasCompleted = false;

    GameEngine(String gridLayout) {
        grid = new Grid(gridLayout, this);
    }

    void play() {
        while (!hasCompleted) {
            consoleOutput.display("\nEnter option : ");
            PlayerInput playerInput = new PlayerInput(new ConsoleInputReader().readSingleInput());
            grid.updateGrid(playerInput);
        }
    }

    void hasFinished(String status) {
        if (status.equals("mine")) {
            consoleOutput.display("Game over. You stepped on mine.");
            setHasCompleted();
        } else {
            consoleOutput.display("You won!");
            setHasCompleted();
        }

    }
}
