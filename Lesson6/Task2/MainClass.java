package Lesson6.Task2;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<Box> boxes = new ArrayList<>();

        Box box = new Box();
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        boxes.add(box);

        box = new Box();
        box.add(new Apple());
        box.add(new Apple());
        box.add(new Apple());
        boxes.add(box);

        box = new Box();
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        boxes.add(box);

        box = new Box();
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        box.add(new Orange());
        boxes.add(box);

        boxes.get(0).splitBoxes(boxes.get(1));

        System.out.println("Коробка 1: " + boxes.get(0).toString());
        System.out.println("Коробка 2: " + boxes.get(1).toString());

        System.out.println("Коробка 3: " + boxes.get(2).toString());
        System.out.println("Коробка 4: " + boxes.get(3).toString());

        if (boxes.get(1).compare(boxes.get(2))) {
            System.out.println("Вес коробок 2 и 3 одинаков.");
        } else {
            System.out.println("Вес коробок 2 и 3 разный.");
        }

        if (boxes.get(1).compare(boxes.get(3))) {
            System.out.println("Вес коробок 2 и 4 одинаков.");
        } else {
            System.out.println("Вес коробок 2 и 4 разный.");
        }
    }
}
