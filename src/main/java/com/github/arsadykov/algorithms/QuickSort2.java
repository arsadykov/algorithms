package com.github.arsadykov.algorithms;

import java.util.Random;

/**
 *
 * @author Arthur Sadykov
 */
public class QuickSort2 {

    //--------------------------------------------------------------------------
    private static void exch(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    //--------------------------------------------------------------------------
    private static int partition(int[] a, int lo, int hi) {  // Разбиение на a[lo..i-1], a [i], a[i+1..hi] .
        int i = lo, j = hi + 1;  //  Левый и правый индексы просмотра
        int v = a[lo];  //  Центральный элемент
        while (true) {  // Просмотр справа,  просмотр слева, проверка на завершение и обмен,
            while (a[++i] < v) {
                if (i == hi) {
                    break;
                }
            }
            while (v < a[--j]) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    private static void sort(int[] a, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(a, lo, hi);  // Разбиение  (см. листинг 2.3.2) .
        sort(a, lo, j - 1);  // Сортировка левой части a[lo .. j-1].
        sort(a, j + 1, hi);  // Сортировка правой части a[j+l .. hi]  .
    }

    private static void qsort(int[] a) {
        sort(a, 0, a.length - 1);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int[] a = new int[50];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }
        qsort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    //--------------------------------------------------------------------------
}
