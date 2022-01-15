package com.github.arsadykov.algorithms;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Arthur Sadykov
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Введите количество элементов массива => ");
        n = sc.nextInt();
        System.out.println("\tВведите элементы массива ");
        int key[] = new int[n];
        Random rn = new Random();
        for (int i = 0; i < key.length; i++) {
            key[i] = rn.nextInt(100);
        }
        System.out.println("\n Поиск ключа");
        int lev = 0, prav = 0, k = 0;
        boolean naideno = false;
        int arg;
        do {
            System.out.println("\n Введите аргумент поиска – искомый ключ");
            arg = sc.nextInt();
            if (arg >= 0) {
                if (arg == key[n - 1]) {
                    k = n - 1;
                    naideno = true;
                } else {
                    naideno = false;
                    do {
                        k = (int) ((lev + prav) / 2);
                        if (arg == key[k]) {
                            naideno = true;
                        } else {
                            if (arg > key[k]) {
                                lev = k;
                            } else {
                                prav = k;
                            }
                        }
                    } while (naideno || (lev == prav - 1));
                }
            }
            if (naideno) {
                System.out.println("Ключ найден, его номер " + k);
            } else {
                System.out.println("Такого ключа нет");
            }
        } while (arg >= 0);
    }
}
