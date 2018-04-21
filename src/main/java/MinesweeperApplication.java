import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinesweeperApplication {

    private static Scanner scan = new Scanner(System.in);
    public static int gridSize;

    public static void main(String[] args){
        startGame();
    }

    static void startGame() {
        System.out.print("Enter the minefield layout : ");
        String in = scan.nextLine().toLowerCase().trim();
        displayLayout(in);
    }

    static void displayLayout(String gridLayout) {
        gridLayout = gridLayout.replaceAll("[a-zA-Z]", "x").replace("\"","");
        List<String> items = Arrays.asList(gridLayout.split(","));
        gridSize = items.size();
        for (String item: items)System.out.println(item);
    }


}
