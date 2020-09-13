package Lesson2.Task10;

import java.util.Arrays;

public class ArrNulEnd {
    public static void main(String[] args) {
        int[] Arr = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int len = Arr.length;
        int[] newArr = new int[len];
        int i = 0;
        for (int element : Arr) {
            if (element != 0) {
                newArr[i] = element;
                i++;
            }
        }
        System.out.println("Новый массив: " + Arrays.toString(newArr));
    }
}
