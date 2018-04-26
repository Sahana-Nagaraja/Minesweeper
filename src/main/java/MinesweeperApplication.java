public class MinesweeperApplication {
    public static void main(String[] args){
        startGame();
    }

    private static void startGame() {
        System.out.print("Enter the minefield layout : ");
        String gridLayout = new ConsoleInputReader().readSingleInput();
        GameEngine gameEngine = new GameEngine(gridLayout);
        gameEngine.play();
    }

}
