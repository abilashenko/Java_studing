package Lesson2.Task9;

import java.util.Arrays;

public class ConvArr {
    public static void main(String[] args) {
        int[] Arr = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int len = Arr.length;
        int[] ArrConv = new int[len];
        for (int i = 0, j = len - 1; i < len; i++, j--) {
            ArrConv[i] = Arr[j];
        }
        System.out.println("Обратный массив: " + Arrays.toString(ArrConv));
    }
}
