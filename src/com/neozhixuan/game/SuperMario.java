package src.com.neozhixuan.game;

public class SuperMario implements GameConsole{
    public void up(){
        System.out.println("Jump");
    }
    public void down(){
        System.out.println("Fall");
    }
    public void left(){
        System.out.println("Retreat");
    }
    public void right(){
        System.out.println("Advance");
    }
}
