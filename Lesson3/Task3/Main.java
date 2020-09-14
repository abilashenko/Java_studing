package Lesson3.Task3;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Student aspirant = new Aspirant();

        Student[] students = new Student[2];
        students[0] = student;
        students[1] = aspirant;

        for (int i = 0; i < 2; i++) {
            System.out.println(students[i].getScholarship(4.9));
            System.out.println(students[i].getScholarship(5));
        }
    }
}
