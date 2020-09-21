package Lesson3.Task3;

public class Main {
    public static void main(String[] args) {
        String studentType;

        Student[] students = new Student[6];
        students[0] = new Student("Иванов", "Иван", 3, 5);
        students[1] = new Student("Петров", "Пётр", 4, 4.7);
        students[2] = new Aspirant("Васин", "Василий", 1, 5, false);
        students[3] = new Aspirant("Максимов", "Максим", 2, 4.9, false);
        students[4] = new Aspirant("Алексеев", "Алексей", 1, 5, true);
        students[5] = new Aspirant("Сергеев", "Сергей", 2, 4.9, true);

        for (int i = 0; i < 6; i++) {
            if (students[i] instanceof Aspirant) {
                studentType = "аспирант";
            } else {
                studentType = "студент";
            }
            System.out.println("Стипендия " + studentType + "а " + students[i].lastName + "а из группы " + students[i].group + " - " + students[i].getScholarship());
        }
    }
}