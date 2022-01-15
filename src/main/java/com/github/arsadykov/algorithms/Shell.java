package com.github.arsadykov.algorithms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur Sadykov
 */
public class Shell {

    public static void sort(int[] a) { // Сортировка а[] по возрастанию,
        int N = a.length;
        int h = 1;
        while (h < N / 3) {
            h = 3 * h + 1; // 1, 4, 13, 40, 121, 364, 1093, ...
        }
        while (h >= 1) { // h-сортировка массива.
            for (int i = h; i < N; i++) { // Вставка a[i] между a[i-h], a[i-2*h], a[i-3*h]... .
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
                    int tmp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = tmp;
                }
            }
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        try ( Scanner in = new Scanner(System.in)) {
            Random random = new Random();
            System.out.println("Введите количество элементов массива:");
            int N = in.nextInt();
            int[] nums = new int[N];
            for (int i = 0; i < N; i++) {
                nums[i] = random.nextInt(100);
            }
            System.out.println("Исходный массив:\n\n");
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
            System.out.println("Провести измерение времени выполнения поиска?");
            System.out.println("('Y' - ДА, любой другой символ - завершить программу)");
            String flag = in.next();
            if (flag.equals("Y")) {
                //Создание таймера
                Stopwatch stopwatch = new Stopwatch();
                sort(nums);
                long elapsedTime = stopwatch.elapsedTime();
                System.out.println("Время выполнения  сортировки Шелла в массиве из " + nums.length
                        + " чисел: " + elapsedTime + " мс");
            } else {
                sort(nums);
            }
            System.out.println("Упорядоченный массив:\n\n");
            for (int i = 0; i < nums.length; i++) {
                System.out.println(nums[i]);
            }
        }
    }
}
