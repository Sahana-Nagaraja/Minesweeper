public class MinesweeperApplication {
    public static void main(String[] args){
        startGame();
    }

    static void startGame() {
        System.out.print("Enter the minefield layout : ");
        String in = new ConsoleInputReader().readSingleInput();
        getInput(in);
    }

    private static void getInput(String gridLayout) {
        GameEngine gameEngine = new GameEngine(gridLayout);
        gameEngine.play();
    }

}
