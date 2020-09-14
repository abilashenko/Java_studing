package Lesson3.Task2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("мышей", "Подольска");
        animals[1] = new Horse("траву", "Ярославля");
        animals[2] = new Dog("мясо", "Щёлково");

        Ветеринар ветеринар = new Ветеринар();
        for (int i = 0; i < 3; i++) {
            ветеринар.treatAnimal(animals[i]);
        }
    }
}
