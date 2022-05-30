package src.com.neozhixuan.game;

public class GameRunner {
    public static void main(String[] args) {
        GameConsole gameconsole = new Tetris();
        gameconsole.up();
        gameconsole.down();
        gameconsole.left();
    }
}
