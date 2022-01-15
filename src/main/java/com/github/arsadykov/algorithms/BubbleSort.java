package com.github.arsadykov.algorithms;

import java.util.Random;

/**
 *
 * @author Arthur Sadykov
 */
public class BubbleSort {

    //--------------------------------------------------------------------------
    public static void bubbleSort(int[] a) {
        int out, in;
        for (out = a.length - 1; out > 0; out--) {
            for (in = 0; in < out; in++) {
                if (a[in] > a[in + 1]) {
                    int tmp = a[in + 1];
                    a[in + 1] = a[in];
                    a[in] = tmp;
                }
            }
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
        bubbleSort(a);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
