package Lesson2.Task8;

import java.util.Arrays;

public class FromArray {
    public static void main(String[] args) {
        int[] Arr = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(Arr);
        int len = Arr.length;
        int sumPos = 0;
        int posQty = 0;
        int sumEvenNeg = 0;
        double sumNeg = 0;
        int negQty = 0;
        for (int element : Arr) {
            if (element > 0) {
                sumPos += element;
                posQty++;
            }
            if (element < 0) {
                sumNeg += element;
                negQty++;
                if (element % 2 == 0) {
                    sumEvenNeg += element;
                }
            }
        }
        System.out.println("Наибольшее число в массиве: " + Arr[len - 1]);
        System.out.println("Сумма положительных элементов массива: " + sumPos);
        System.out.println("Сумма чётных отрицательных элементов массива: " + sumEvenNeg);
        System.out.println("Количество положительных элементов массива: " + posQty);
        System.out.println("Среднее арифметическое отрицательных элементов массива: " + sumNeg / negQty);
    }
}
