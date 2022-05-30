package src.com.neozhixuan.inheritance;

import javax.swing.event.SwingPropertyChangeSupport;

public class Animal {

  public String type;

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void sound() {
    System.out.println(this.type);
  }
}
