package src.com.neozhixuan.game;

public class Tetris implements GameConsole {
    public void up(){
        System.out.println("Turn");
    }
    public void down(){
        System.out.println("Fall Faster");
    }
    public void left(){
        System.out.println("Left");
    }
    public void right(){
        System.out.println("Right");
    }
}
