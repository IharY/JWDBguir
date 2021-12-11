package by.bsuir.yanushkevich.lab01;

//Задача 5. Решить задачу.
//Дана целочисленная таблица А[n]. Найти наименьшее число K элементов, которые можно
//выкинуть из данной последовательности, так чтобы осталась возрастающая
//подпоследовательность.

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int elnum = sc.nextInt();
        int[] mas = new int[elnum];
        int point;
        int trash = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) - 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        point = mas[0];
        for (int ma : mas) {
            if (ma < point) {
                trash++;
            } else {
                point = ma;
            }
        }
        System.out.println("Минимальное количество элементов " + trash);
    }
}
