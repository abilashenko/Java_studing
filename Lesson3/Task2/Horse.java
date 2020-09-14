package Lesson3.Task2;

public class Horse extends Animal {
    String age;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise() {
        System.out.println("Лошадь стучит копытами!");
    }

    @Override
    void eat() {
        System.out.println("Лошадь щиплет травку!");
    }
}
