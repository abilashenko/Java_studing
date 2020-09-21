package Lesson3.Task3;

public class Aspirant extends Student {
    public boolean scientificWork;

    public Aspirant(String lastName, String firstName, int group, double averageMark, boolean scientificWork) {
        super (lastName, firstName, group, averageMark);
        this.scientificWork = scientificWork;
    }

    @Override
    public int getScholarship() {
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
