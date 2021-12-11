package by.bsuir.yanushkevich.lab01;

//Задача 7. Решить задачу.
//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по
//возрастанию. Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 .
//Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, то производится
//перестановка и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов последовательности");
        int elnum = sc.nextInt();
        int[] mas = new int[elnum];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) - 5;
        }
        System.out.println("Исходная последовательность");
        printArr(mas);
        System.out.println();
        int i = 0;
        int leng = mas.length - 1;
        while (i < leng) {
            if (mas[i] <= mas[i + 1]) {
                i++;
            } else {
                int temp = mas[i];
                mas[i] = mas[i + 1];
                mas[i + 1] = temp;
                if (i > 0) {
                    i--;
                }
            }
        }
        System.out.println("Отсортированная последовательность");
        printArr(mas);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
