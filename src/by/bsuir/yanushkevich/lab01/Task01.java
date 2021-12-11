package by.bsuir.yanushkevich.lab01;

import java.util.Scanner;

//Задача 1. Решить задачу.
// Вычислить значение выражения по формуле (все пернеменные принимают действительные значения):
// (1 + sin^2(x + y)) / (2 + MOD(x - 2*x / (1 + x^2y^2))) + x

public class Task01 {
    public static void main(String[] args) {
        double result, x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа x и y");
        x = sc.nextInt();
        y = sc.nextInt();
        result = (1 + Math.pow(Math.sin(x + y), 2)) / (2 + Math.abs(x - (2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)))) + x;
        System.out.printf("%f - получившееся значение", result);
    }
}
