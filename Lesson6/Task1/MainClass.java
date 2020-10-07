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

        arrayClass.remove(2);
        System.out.println("Из коллекции удалили 2-й элемент : " + arrayClass.toString());

        arrayClass.remove("KTM");
        System.out.println("Из коллекции удалили элемент 'KTM': " + arrayClass.toString());

        System.out.println("Первый элемент коллекции: " + arrayClass.get(0));

        arrayClass.clear();
        System.out.println("Коллекция очищена: " + arrayClass.toString());
    }
}
