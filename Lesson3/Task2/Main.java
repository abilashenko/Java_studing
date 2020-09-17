package Lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("мышей", "Подольска", "Макс");
        animals[1] = new Horse("траву", "Ярославля", 5);
        animals[2] = new Dog("мясо", "Щёлково", "Питбуль");

        Veterinar veterinar = new Veterinar();
        for (int i = 0; i < 3; i++) {
            veterinar.treatAnimal(animals[i]);
        }
    }
}
