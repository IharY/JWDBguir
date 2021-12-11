package by.bsuir.yanushkevich.lab01;

//Задача 8. Решить задачу.
// Пусть даны две неубывающие последовательности действительных чисел a1 <= a2 <= … <=an и b1
//<= b2 <= … <= bm. Требуется указать те места, на которые нужно вставлять элементы
//последовательности b1 <= b2 <= … <= bm в первую последовательность так, чтобы новая
//последовательность оставалась возрастающей.

public class Task08 {

    public static void main(String[] args) {

        printLocationInsert(new int[]{1, 2, 4, 4, 6, 6, 8, 9, 11}, new int[]{-2, 0, 4, 4, 5, 5, 5, 6, 7, 8, 9, 9, 15});

    }

    private static void printLocationInsert(int[] array1, int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            boolean flagIns = true;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] <= array1[j]) {
                    System.out.printf("%d элемент второго масс. вставим до %d элем. первого\n", i, j);
                    flagIns = false;
                    break;
                }
            }
            if (flagIns)
                System.out.printf("%d элемент первого масс. вставим после последнего элем. второго\n", i);
        }
    }
}

      /*  int[] A = {10, 12, 12, 13, 18, 25, 25};
        int[] B = {1, 2, 4, 11, 11, 28, 29};
        int[] C = new int[B.length];
        int j = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= B[j]) {
                C[j] = i;
                j++;
            }
        }
        while (j < B.length - 1) {
            C[j] = A.length;
            j++;
            System.out.print(C[j] + " ");
        }*/


