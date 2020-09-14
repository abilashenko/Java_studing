package Lesson3.Task2;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    void makeNoise() {
        System.out.println("Животное шумит!");
    }

    void eat() {
        System.out.println("Животное ест!");
    }

    void sleep() {
        System.out.println("Животное спит!");
    }
}
