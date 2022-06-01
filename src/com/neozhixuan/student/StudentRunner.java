package src.com.neozhixuan.student;

public class StudentRunner {
    public static void main(String[] args) {
        int[] marks = {97,80,67};

        Student student = new Student("Zhixuan", marks);
        // variable argument
        Student2 student2 = new Student2("Zhixuan", 97, 80, 67);

        System.out.println(student.getNumberOfMarks());
        System.out.println(student.getTotalSumOfMarks());
        System.out.println(student.getMaximumMark());
        System.out.println(student.getMinimumMark());
    }
}
