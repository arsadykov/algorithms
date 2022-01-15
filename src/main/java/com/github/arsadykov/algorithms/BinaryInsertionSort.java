package com.github.arsadykov.algorithms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur Sadykov
 */
public class BinaryInsertionSort {

    //--------------------------------------------------------------------------
    public static void binInsertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int L = 0;
            int R = i;
            int x = a[i];
            while (L < R) {
                int m = (L + R) / 2;
                if (a[m] > x) {
                    R = m;
                } else {
                    L = m + 1;
                }
            }
            for (int j = i; j > L; j--) {
                a[j] = a[j - 1];
            }
            a[L] = x;
        }
    }
    //--------------------------------------------------------------------------

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Введите количество чисел в массиве:");
        int N;
        try ( Scanner in = new Scanner(System.in)) {
            N = in.nextInt();
        }
        Random random = new Random();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = random.nextInt(100);
        }
        System.out.println("\n\nИсходный массив:\n");
        for (int num : nums) {
            System.out.println(num);
        }
        Stopwatch stopwatch = new Stopwatch();
        binInsertionSort(nums);
        System.out.println("Elapsed time: " + stopwatch.elapsedTime());
        System.out.println("\n\nОтсортированный массив:\n");
        for (int num : nums) {
            System.out.println(num);
        }
    }
    //--------------------------------------------------------------------------
}
