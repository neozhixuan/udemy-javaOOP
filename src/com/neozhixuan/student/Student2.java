package src.com.neozhixuan.student;

public class Student2 {
    private String name;
    private int[] marks;

    // variable argument must be the second parameter
    public Student2(String name, int... marks){
        this.name = name;
        this.marks = marks;
    }
}
