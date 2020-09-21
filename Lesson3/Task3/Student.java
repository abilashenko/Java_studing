package Lesson3.Task3;

public class Student {
    public String firstName;
    public String lastName;
    public int group;
    public double averageMark;
    public int scholarship;
    public Boolean scientificWork;

    public Student(String lastName, String firstName, int group, double averageMark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getScholarship(double averageMark, Boolean scientificWork) {
        if (averageMark == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }
}
