package Lesson6.Task2;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private final ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public Float getBoxWeight() {
        Float weight = 0.0f;

        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return Float.compare(getBoxWeight(), box.getBoxWeight()) == 0;
    }

    public void splitBoxes(Box<T> box) {
        for (T fruit : fruits) {
            box.add(fruit);
        }
        fruits.clear();
    }

    @Override
    public String toString() {
        String str = "";
        str += fruits.size() + " шт, ";
        str += "вес коробки - " + getBoxWeight() + ".";
        return str;
    }
}