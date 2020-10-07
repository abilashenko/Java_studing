package Lesson6.Task1;

public class MainClass {
    public static void main(String[] args) {
        ArrayClass<Integer> arrayClass = new ArrayClass<>();
        System.out.println("Текущий размер массива: " + arrayClass.size());

        arrayClass.add(10);
        arrayClass.add(20);
        arrayClass.add(30);
        int[] tempArray = new int[3];
        for (int i = 0; i < 3; i++) {
            tempArray[i] = arrayClass.get(i);
        }
        System.out.println("Добавляем в массив цифры 10, 20, 30. Массив: {" + tempArray + "}");
    }
}
