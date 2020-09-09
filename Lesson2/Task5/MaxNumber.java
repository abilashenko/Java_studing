package Lesson2.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
        public static void main(String[] args) {
            int n1;
            int n2;
            int n3;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первое целое число:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не целое число!\nВведите первое целое число:");
                    scanner.next();
                }
                n1=scanner.nextInt();
                System.out.println("Введите второе целое число:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не целое число!\nВведите второе целое число:");
                    scanner.next();
                }
                n2=scanner.nextInt();
                System.out.println("Введите третье целое число:");
                while (!scanner.hasNextInt()) {
                    System.out.println("Вы ввели не целое число!\nВведите третье целое число:");
                    scanner.next();
                }
                n3=scanner.nextInt();
                int Arr[]={n1, n2, n3};
                Arrays.sort(Arr);
                System.out.println("Наименьшее число из трёх введённых: " + Arr[0]);
            }
        }
