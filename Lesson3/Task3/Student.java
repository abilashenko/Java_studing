package Lesson3.Task3;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averageMark;
    int scholarship;

    int getScholarship(double averageMark) {
        if (averageMark == 5) {
            scholarship = 100;
        } else {
            scholarship = 80;
        }
        return scholarship;
    }
}
