package com.github.arsadykov.algorithms;

import java.util.Random;

/**
 *
 * @author Arthur Sadykov
 */
public class ScheikerSort {

    //--------------------------------------------------------------------------
    public static void scheikerSort(int[] a) {
        int L = 1;
        int R = a.length;
        int number = 0;
        do {
            for (int i = L; i < R; i++) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    number = i;
                }
            }
            R = number;
            for (int i = R; i >= L; i--) {
                if (a[i] < a[i - 1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    number = i;
                }
            }
            L = number;
        } while (L < R);
    }

    //--------------------------------------------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        scheikerSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
