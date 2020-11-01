package sample;

public class Main1 {
    public static void main(String []args){
        Student student1 = new Student("A",19,223,4.3);
        Student student2 = new Student("B",18,321,4.8);
        Student student3 = new Student("C",20,145,3.7);

        Student[] students;
        students = new Student[]{student1, student2, student3};

        List list = new List(students);
        list.sort(students);

    }
}
