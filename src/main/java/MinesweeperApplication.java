import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MinesweeperApplication {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        startGame();
    }

    static void startGame() {
        System.out.print("Enter the minefield layout : ");
        String in = scan.nextLine().toLowerCase().trim();
        String gridLayout = in.replaceAll("[a-zA-Z]", "x").replace("\"","");
        List<String> items = Arrays.asList(gridLayout.split(","));
        for (String item: items)System.out.println(item.toCharArray());

    }
}
