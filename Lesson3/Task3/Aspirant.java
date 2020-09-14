package Lesson3.Task3;

public class Aspirant extends Student {
    Boolean scientificWork = true;

    @Override
    int getScholarship(double averageMark) {
        if (averageMark == 5) {
            scholarship = 200;
        } else {
            scholarship = 180;
        }
        return scholarship;
    }
}
