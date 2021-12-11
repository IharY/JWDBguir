package by.bsuir.yanushkevich.lab01;

//Задача 6. Решить задачу.
//Даны действительные числа a1, a2, …, an. Получить следующую квадратную матрицу порядка n.
// a1     a2   ... a(n-1) a(n)
// a2     a3   ... a(n)   a1
// .    .    .    .     .
// a(n-1) a(n) ... a(n-3) a(n-2)
// a(n)   a1   ... a(n-2) a(n-1)

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество элементов столбца квадратной матрицы");
        int elnum = sc.nextInt();
        int[][] matrix = new int[elnum][elnum];
        int[] mas = new int[elnum];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) - 10;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = mas[j];
                System.out.print(matrix[i][j] + " ");
            }
            arraySwap(mas);
            System.out.println();
        }

    }

    public static int[] arraySwap(int[] arr) {
        int firstel;
        firstel = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                arr[i] = arr[i + 1];
            }
        }
        arr[arr.length - 1] = firstel;
        return arr;
    }
}
