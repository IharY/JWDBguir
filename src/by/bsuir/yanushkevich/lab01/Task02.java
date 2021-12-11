package by.bsuir.yanushkevich.lab01;

import java.util.Scanner;

//Задача 2. Решить задачу.
// Для данной области составить программу, которая печатает true, если точка с координатами (х,
// у) принадлежит закрашенной области, и false — в противном случае.

public class Task02 {

    public static void main(String[] args) {
        int x1 = -6, x2 = -4, x3 = 4, x4 = 6;
        int y1 = -3, y2 = 5;
        int x, y;
        boolean result = false;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа x и y");
        x = sc.nextInt();
        y = sc.nextInt();

        if (y >= y1 && y <= y2 && x >= x1 && x <= x4) {
            if (y > 0) {
                result = (x >= x2 && x <= x3);
            } else {
                result = true;
            }
        }
        System.out.println(result);
    }
}
