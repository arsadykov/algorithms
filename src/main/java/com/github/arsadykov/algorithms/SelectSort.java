package com.github.arsadykov.algorithms;

import java.util.Random;

/**
 *
 * @author Arthur Sadykov
 */
public class SelectSort {

    public static void selectSort(int[] a) {
        int out, in, min;
        for (out = 0; out < a.length; out++) {
            min = out;
            for (in = out + 1; in < a.length; in++) {
                if (a[in] < a[min]) {
                    min = in;
                }
            }
            int tmp = a[out];
            a[out] = a[min];
            a[min] = tmp;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        selectSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
