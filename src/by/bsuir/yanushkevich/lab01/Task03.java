package by.bsuir.yanushkevich.lab01;

//Задача 3. Решить задачу.
//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//представить в виде таблицы, первый столбец которой – значения аргумента, второй -
//соответствующие значения функции. F(x) = tg(x)

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите границы отрезка и значение шага h");
        double a, b, h;
        a = sc.nextInt();
        b = sc.nextInt();
        h = sc.nextInt();
        while (a <= b) {
            System.out.printf("tg(%.0f) = %.3f\n", a, Math.tan(a));
            a += h;
        }

    }
}
