//Understands user input from the console
import java.util.Scanner;

public class ConsoleInputReader {
    private static Scanner scan = new Scanner(System.in);

    public String  readSingleInput() {
        String in = scan.nextLine().toLowerCase().trim();
        return in;
    }
}
