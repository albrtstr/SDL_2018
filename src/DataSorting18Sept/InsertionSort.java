/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataSorting18Sept;

import static DataSorting18Sept.SelectionSort.selectionSort;
import java.util.Arrays;

/**
 *
 * @author basisb27
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] list = {4, 3, 5, 2, 6};

        System.out.println("Data awal = " + Arrays.toString(list));
        insertionSort(list);
        System.out.println("Data urut = " + Arrays.toString(list));
    }

    public static int[] insertionSort(int[] list) {
        int holePosition;
        int valueToInsert;

        for (int i = 1; i < list.length; i++) {
            valueToInsert = list[i];
            holePosition = i;

            while (holePosition > 0 && list[holePosition - 1] > valueToInsert) {
                list[holePosition] = list[holePosition - 1];
                holePosition = holePosition - 1;
            }

            list[holePosition] = valueToInsert;
        }
        return list;
    }
}
