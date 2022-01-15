package com.github.arsadykov.algorithms;

import java.util.Scanner;

/**
 *
 * @author Arthur Sadykov
 */
public class AcceleratelLinearSearch {

    //--------------------------------------------------------------------------
    public static int linearSearch(String[] s, String arg) {
        int i;
        for (i = 0; i < s.length; i++) {
            if (arg.equals(s[i])) {
                break;
            }
        }
        if (i == s.length) {
            return -1;
        } else {
            return i;
        }
    }

    //--------------------------------------------------------------------------
    public static void insertionSort(String[] s) {
        for (int i = 1; i < s.length; i++) {
            String tmp = s[i];
            int j;
            for (j = i; j > 0 && s[j - 1].compareTo(tmp) > 0; j--) {
                s[j] = s[j - 1];
            }
            s[j] = tmp;
        }
    }

    //--------------------------------------------------------------------------
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( Scanner in = new Scanner(System.in)) {
            System.out.println("Введите строку текста:");
            String input = in.nextLine();
            String[] tokens = input.split("\\s+");
            insertionSort(tokens);
            System.out.println("Введите слово:");
            String arg = in.next();
            int index;
            if ((index = linearSearch(tokens, arg)) == -1) {
                System.out.println("Слово не найдено");
            } else {
                System.out.println("Слово " + arg + " найдено. Индекс в упорядоченном массиве: " + index);
            }
        }
    }
    //--------------------------------------------------------------------------
}
