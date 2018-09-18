/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSorting18Sept;

import java.util.Arrays;

/**
 *
 * @author basisb27
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {4, 3, 5, 2, 6};
        System.out.println("Data Acak = " +Arrays.toString(a));

        bubbleSort(a);
        System.out.println("Data Urut = "+Arrays.toString(a));

    }

    public static int[] bubbleSort(int[] a) {
        for (int j = 0; j < a.length - 2; j++) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    int swap = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = swap;
                }
            }
        }
        return a;
    }
}
