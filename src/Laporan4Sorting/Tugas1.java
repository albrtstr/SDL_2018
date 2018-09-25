/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan4Sorting;

import java.util.Arrays;

/**
 *
 * @author basisb22
 */
public class Tugas1 {
    
    public static void main(String[] args) {
        int[] list = {23, 43, 56, 1, 34, 89, 65, 4, 77, 56, 54, 33, 45, 23, 89, 76, 12, 67, 54, 8, 9, 44, 98, 100};
        System.out.println("Data awal             = " + Arrays.toString(list));
        
        System.out.println("\nBUBBLE SORT");
        bubbleSortAsc(list);
        System.out.println("Data urut ascending   = " + Arrays.toString(list));
        
        bubbleSortDesc(list);
        System.out.println("Data urut descending  = " + Arrays.toString(list));
        
        System.out.println("\nSELECTION SORT");
        selectionSortAsc(list);
        System.out.println("Data urut ascending   = " + Arrays.toString(list));
        
        selectionSortDesc(list);
        System.out.println("Data urut descending  = " + Arrays.toString(list));
        
        System.out.println("\nINSERTION SORT");
        insertionSortAsc(list);
        System.out.println("Data urut ascending   = " + Arrays.toString(list));
        
        insertionSortDesc(list);
        System.out.println("Data urut descending  = " + Arrays.toString(list));
        
    }
    
    public static int[] bubbleSortAsc(int[] list) {
        for (int i = 0; i < list.length - 2; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int swap = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = swap;
                }
            }
        }
        return list;
    }
    
    public static int[] bubbleSortDesc(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1; j++) {
                if (list[j] < list[j + 1]) {
                    int swap = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = swap;
                }
            }
        }
        return list;
    }
    
    public static int[] selectionSortAsc(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int swap = list[min];
                list[min] = list[i];
                list[i] = swap;
            }
        }
        return list;
    }
    
    public static int[] selectionSortDesc(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] > list[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int swap = list[min];
                list[min] = list[i];
                list[i] = swap;
            }
        }
        return list;
    }
    
    public static int[] insertionSortAsc(int[] list) {
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
    
    public static int[] insertionSortDesc(int[] list) {
        int holePosition;
        int valueToInsert;
        
        for (int i = 1; i < list.length; i++) {
            valueToInsert = list[i];
            holePosition = i;
            
            while (holePosition > 0 && list[holePosition - 1] < valueToInsert) {
                list[holePosition] = list[holePosition - 1];
                holePosition = holePosition - 1;
            }
            
            list[holePosition] = valueToInsert;
        }
        return list;
    }
}
