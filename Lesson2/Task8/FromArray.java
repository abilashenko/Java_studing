package Lesson2.Task8;

import java.util.Arrays;

public class FromArray {
    public static void main(String[] args) {
        int[] Arr = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        Arrays.sort(Arr);
        int len=Arr.length;
        int pos=0;
        int neg=0;

        for (int element : Arr)
        {
            if (element>0) {pos++;}
            else if (element<0) {neg++;}
        }
        int[] ArrPos=new int[pos];
        int[] ArrNeg=new int[neg];
        pos=0;
        neg=0;

        for (int element : Arr)
        {
            if (element>0) {ArrPos[pos++]=element;}
            else if (element<0) {ArrNeg[neg++]=element;}
        }

        int sumPos=0;
        for(int element : ArrPos) {
            sumPos+=element;
        }

        int sumEvenNeg=0;
        for(int element : ArrNeg) {
            if (element%2==0) {sumEvenNeg+=element;}
        }

        double sumNeg=0;
        for(int element : ArrNeg) {
            sumNeg+=element;
        }

        System.out.println("Наибольшее число в массиве: " + Arr[len-1]);
        System.out.println("Сумма положительных элементов массива: " + sumPos);
        System.out.println("Сумма чётных отрицательных элементов массива: " + sumEvenNeg);
        System.out.println("Количество положительных элементов массива: " + ArrPos.length);
        System.out.println("Среднее арифметическое отрицательных элементов массива: " + sumNeg/ArrNeg.length);
    }
}
