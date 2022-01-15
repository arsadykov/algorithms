package com.github.arsadykov.algorithms;

import java.util.Random;

/**
 *
 * @author Arthur Sadykov
 */
public class InsertionSort {

    //--------------------------------------------------------------------------
    public static void insertionSort(int[] a) {
        int out, in;
        for (out = 1; out < a.length; out++) {
            for (in = out; in > 0 && a[in] < a[in - 1]; in--) {
                a[in] = a[in - 1];
            }
            a[in] = a[out];
        }
    }

    //--------------------------------------------------------------------------
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
        insertionSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
