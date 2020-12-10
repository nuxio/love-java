package reusing;

import static com.nuxio.util.Print.*;

class Game {
    Game(int i) {
        print("Game constructor");
    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);
        print("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess(int i) {
        super(i);
        print("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess(1);
    }
}
