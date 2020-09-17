package Lesson3.Task3;

public class Aspirant extends Student {

    public Aspirant(String lastName, String firstName, int group, double averageMark, Boolean scientificWork) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.averageMark = averageMark;
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship(double averageMark, Boolean scientificWork) {
        if (averageMark == 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        if (scientificWork) {
            return scholarship += 100;
        } else {
            return scholarship;
        }
    }
}
