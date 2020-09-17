package Lesson3.Task2;

public class Veterinar {
    public void treatAnimal(Animal animal) {
        System.out.println("На приёме животное из " + animal.getLocation() + ", которое ест " + animal.getFood() + "!");
    }
}
