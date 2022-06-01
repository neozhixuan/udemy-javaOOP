package src.com.neozhixuan.abstractExample;

public class Recipe1 extends AbstractTest{
    void getReady(){
        System.out.println("Get raw materials");
    }
    void doTheDish(){
        System.out.println("Washing");
    }
    void cleanUp(){
        System.out.println("Cleaning");
    }
}
