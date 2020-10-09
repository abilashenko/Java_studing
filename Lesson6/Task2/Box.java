package Lesson6.Task2;

import java.util.ArrayList;

public class Box {
    private final ArrayList<Fruit> fruits;
    public String boxType;

    public Box() {
        fruits = new ArrayList<>();
        boxType = "empty";
    }

    public void add(Fruit fruit) {
        if (boxType.equals("empty")) {
            if (fruit instanceof Apple) {
                boxType = "apple";
            } else if (fruit instanceof Orange) {
                boxType = "orange";
            } else {
                System.out.println("Коробка только для яблок и апельсинов");
            }
        } else {
            switch (boxType) {
                case "apple":
                    if (!(fruit instanceof Apple)) {
                        System.out.println("Коробка только для яблок");
                    }
                    break;
                case "orange":
                    if (!(fruit instanceof Orange)) {
                        System.out.println("Коробка только для апельсинов");
                    }
                    break;
                default:
                    System.out.println("Коробка только для яблок и апельсинов");
            }
        }
        fruits.add(fruit);
    }

    public Float getBoxWeight() {
        Float weight = 0.0f;

        for (Fruit frut : fruits) {
            weight += frut.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return Float.compare(getBoxWeight(), box.getBoxWeight()) == 0;
    }

    public void splitBoxes(Box box) {
        for (Fruit fruit : fruits) {
            box.add(fruit);
        }
        fruits.clear();
        boxType = "empty";
    }

    @Override
    public String toString() {
        String str = "в коробке ";
        switch (boxType) {
            case "apple":
                str += "яблоки, ";
                break;
            case "orange":
                str += "апельсины, ";
                break;
            default:
                str = "в коробке нет яблок или апельсинов, ";
                break;
        }
        str += fruits.size() + " шт, ";
        str += "вес коробки - " + getBoxWeight() + ".";
        return str;
    }
}