package Lesson6.Task1;

public class MainClass {
    public static void main(String[] args) {
        ArrayClass<String> arrayClass = new ArrayClass<>();

        System.out.println("Текущий размер коллекции: " + arrayClass.size());

        arrayClass.add("KTM");
        arrayClass.add("Husqvarna");
        arrayClass.add("Honda");
        arrayClass.add("Yamaha");
        arrayClass.add("Suzuki");
        arrayClass.add("Beta");

        System.out.println("Добавляем в коллекцию элементы. Коллекция: " + arrayClass.toString());
        System.out.println("Теперь размер коллекции: " + arrayClass.size());

        arrayClass.remove(1);
        System.out.println("Из коллекции удалили 2-й элемент : " + arrayClass.toString());

        arrayClass.remove("KTM");
        System.out.println("Из коллекции удалили элемент 'KTM': " + arrayClass.toString());

        System.out.println("Первый элемент коллекции: " + arrayClass.get(0));

        arrayClass.clear();
        System.out.println("Коллекция очищена: " + arrayClass.toString());

        System.out.println();
        System.out.println("=============================================================");
        System.out.println();

        LinkedClass<String> linkedClass = new LinkedClass<>();

        System.out.println("Текущий размер списка: " + linkedClass.size());

        linkedClass.add("BMW");
        linkedClass.add("Audi");
        linkedClass.add("Mercedes");
        linkedClass.add("Toyota");
        linkedClass.add("Nissan");
        linkedClass.add("Skoda");

        System.out.println("Добавляем в список элементы. Список: " + linkedClass.toString());
        System.out.println("Теперь размер списка: " + linkedClass.size());

        linkedClass.remove(1);
        System.out.println("Из списка удалили 2-й элемент : " + linkedClass.toString());

        linkedClass.remove("Nissan");
        System.out.println("Из списка удалили элемент 'Nissan': " + linkedClass.toString());

        System.out.println("Первый элемент списка: " + linkedClass.get(0));

        linkedClass.clear();
        System.out.println("Список очищен: " + linkedClass.toString());
    }
}
