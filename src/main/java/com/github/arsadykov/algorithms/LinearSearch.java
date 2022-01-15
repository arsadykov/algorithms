package com.github.arsadykov.algorithms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur Sadykov
 */
public class LinearSearch {

    public static int linearSearch(int[] a, int arg) {
        int num = -1;
        for (int i = 1; i < a.length; i++) {
            if (arg == a[i]) {
                num = i;
                break;
            }
        }
        return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Введите количество элементов массива -> ");
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = random.nextInt(10);
        }
        int arg, num = -1;
        do {
            System.out.println("\n Введите аргумент поиска – искомый ключ");
            arg = sc.nextInt();
            if (arg >= 0) {
                num = linearSearch(a, arg);
            }
            if (num == -1) {
                System.out.println("Такого ключа нет");
            } else {
                System.out.println("Ключ найден под номером " + num);
            }
        } while (arg >= 0);
    }
}
