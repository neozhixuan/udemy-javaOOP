package src.com.neozhixuan.abstractExample;

abstract class AbstractTest {
    public void execute(){
        getReady();
        doTheDish();
        cleanUp();
    }
    abstract void getReady();
    abstract void doTheDish();
    abstract void cleanUp();
}
