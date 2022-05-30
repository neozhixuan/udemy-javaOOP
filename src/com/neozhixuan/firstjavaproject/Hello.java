package src.com.neozhixuan.firstjavaproject;

public class Hello {
    public static void main(String[] args){
        Pet pet = new Pet();
        pet.groom(5);
        Pet dog = new Pet("james");
        dog.groom(8);
    }
}
