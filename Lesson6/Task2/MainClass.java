package Lesson6.Task2;

public class MainClass {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());
        appleBox1.add(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());
        appleBox2.add(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());

        appleBox1.splitBoxes(appleBox2);

        System.out.println("Коробка 1 (с яблоками): " + appleBox1.toString());
        System.out.println("Коробка 2 (с яблоками): " + appleBox2.toString());

        System.out.println("Коробка 3 (с апельсинами): " + orangeBox1.toString());
        System.out.println("Коробка 4 (с апельсинами): " + orangeBox2.toString());

        if (appleBox1.compare(orangeBox1)) {
            System.out.println("Вес коробок 2 и 3 одинаков.");
        } else {
            System.out.println("Вес коробок 2 и 3 разный.");
        }

        if (appleBox2.compare(orangeBox2)) {
            System.out.println("Вес коробок 2 и 4 одинаков.");
        } else {
            System.out.println("Вес коробок 2 и 4 разный.");
        }
    }
}
