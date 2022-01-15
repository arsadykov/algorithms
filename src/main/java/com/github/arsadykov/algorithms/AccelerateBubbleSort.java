package com.github.arsadykov.algorithms;

import java.util.Random;

/**
 *
 * @author Arthur Sadykov
 */
public class AccelerateBubbleSort {

    //--------------------------------------------------------------------------
    public static void bubbleSort(int[] a) {
        boolean permutation;
        do {
            permutation = false;
            for (int j = 1; j < a.length; j++) {
                if (a[j] < a[j - 1]) {
                    int tmp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = tmp;
                    permutation = true;
                }
            }
        } while (permutation);
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
    //--------------------------------------------------------------------------
}
