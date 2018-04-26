//Understands user input from the console

import java.util.Scanner;

class ConsoleInputReader {
    private Scanner scan = new Scanner(System.in);

    String readSingleInput() {
        return scan.nextLine().toLowerCase().trim();
    }
}
