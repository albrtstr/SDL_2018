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
public class SelectionSort {
    public static void main(String[] args) {
        int[] list = {4, 3, 5, 2, 6};
        
        System.out.println("Data awal = " +Arrays.toString(list));
        selectionSort(list);
        System.out.println("Data urut = " +Arrays.toString(list));
    }
    
    public static int [] selectionSort (int[] list){
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            if (list[min] != i) {
                int swap = list[min];
                list[min] = list[i];
                list[i] = swap;
                
            }
        }
        return list;
    }
}
