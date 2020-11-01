package sample;

public class List {
    private Student[] students = {};
    public List(Student[] students) {
        this.students = students;
    }

    public void sort(Student[] students){
        int min;
        Student temp;

        for (int i = 0; i < students.length-1; i++)
        {
            min = i;
            for (int scan = i+1; scan < students.length; scan++)
                if (!students[scan].compareto(students[min]))
                    min = scan;
            temp = students[min];
            students[min] = students[i];
            students[i] = temp;
        }
        for (Student student : students){
            System.out.println(student.toString());
        }
    }


}
