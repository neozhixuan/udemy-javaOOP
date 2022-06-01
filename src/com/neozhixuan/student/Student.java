package src.com.neozhixuan.student;

public class Student {
    private String name;
    private int[] marks;

    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }
    public int getNumberOfMarks(){
        return marks.length;
    }

    public int getTotalSumOfMarks(){
        int sum = 0;
        for(int mark:marks){
            sum += mark;
        }
        return sum;
    }

    public int getMaximumMark(){
        int highestMark = marks[0];
        for(int mark:marks){
            if(mark > highestMark){
                highestMark = mark;
            }
        }
        return highestMark;
    }

    public int getMinimumMark(){
        int lowestMark = marks[0];
        for(int mark:marks){
            if(mark < lowestMark){
                lowestMark = mark;
            }
        }
        return lowestMark;
    }

}
