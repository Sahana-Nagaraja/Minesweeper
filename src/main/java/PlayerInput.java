import java.lang.reflect.Type;

public class PlayerInput {
    private final String input;
    private int x;
    private int y;

    PlayerInput(String input) {
        this.input = input;
        this.x = Integer. parseInt(String. valueOf(input.charAt(2)));
        this.y = Integer. parseInt(String. valueOf(input.charAt(4)));
    }

    InputChoice getChoice() {
        Character c = input.charAt(0);
        return  InputChoice.valueOf(c.toString());
    }
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}
