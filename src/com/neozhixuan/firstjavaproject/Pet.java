package src.com.neozhixuan.firstjavaproject;

public class Pet {

  private String name;

  public Pet() {}

  public Pet(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void groom(int groomNumber) {
    for (int i = 0; i < groomNumber; i++) {
      if (this.name == null) {
        System.out.println("Petted");
      } else {
        System.out.println("Pet " + name);
      }
    }
  }
}
