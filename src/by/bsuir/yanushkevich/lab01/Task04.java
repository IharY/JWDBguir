package by.bsuir.yanushkevich.lab01;

//Задача 4. Решить задачу.
//Задан целочисленный массив размерности N. Есть ли среди элементов массива простые числа?
//Если да, то вывести номера этих элементов.

public class Task04 {
    public static void main(String[] args) {
        int[] mas = {2, 4, 5, 17, 90};

        //печатаем массив
        System.out.println("исходный массив:");
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        System.out.println("номера простых чисел в массиве:");
        for (int i = 0; i < mas.length; i++) {
            if (isPrimary(mas[i])) {
                System.out.print(i + 1 + " ");
            }
        }
    }

    public static boolean isPrimary(int x) {
        if (x < 1) {
            return false;
        }
        double sqrtNumber = Math.sqrt(x);
        for (int i = 2; i <= sqrtNumber; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
