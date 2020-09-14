package Lesson3.Task2;

public class Ветеринар {
    void treatAnimal(Animal animal) {
        System.out.println("На приёме животное из " + animal.getLocation() + ", которое ест " + animal.getFood() + "!");
    }
}
