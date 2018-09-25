/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan4Sorting;

/**
 *
 * @author basisb22
 */
public class Tugas2Main {

    public static void main(String[] args) {
        Tugas2Atlet listAtlet[] = new Tugas2Atlet[8];
        listAtlet[0] = new Tugas2Atlet("Hongkong", "To Kenneth", 22.54);
        listAtlet[1] = new Tugas2Atlet("Singapore", "Teong", 22.59);
        listAtlet[2] = new Tugas2Atlet("China", "Yu Hexin", 22.11);
        listAtlet[3] = new Tugas2Atlet("Japan", "Nakamura", 22.20);
        listAtlet[4] = new Tugas2Atlet("Kazakhstan", "Mussin", 22.64);
        listAtlet[5] = new Tugas2Atlet("Japan", "Nakao", 22.46);
        listAtlet[6] = new Tugas2Atlet("Taipei", "Lin", 22.67);
        listAtlet[7] = new Tugas2Atlet("India", "Khade", 22.47);

        System.out.println("Data Sebelum Diurutkan");
        HASIL(listAtlet);
        System.out.println("");

        BubbleSortASC(listAtlet);
        HASIL(listAtlet);
        System.out.println("");
        
        BubbleSortDESC(listAtlet);
        HASIL(listAtlet);
        System.out.println("");
        
        selectionSortASC(listAtlet);
        HASIL(listAtlet);
        System.out.println("");
        
        selectionSortDESC(listAtlet);
        HASIL(listAtlet);
        System.out.println("");
        
        insertionSortASC(listAtlet);
        HASIL(listAtlet);
        System.out.println("");
        
        insertionSortDESC(listAtlet);
        HASIL(listAtlet);
        System.out.println("");
    }

    public static void HASIL(Tugas2Atlet listAtlet[]) {
        System.out.printf("%-5s", "No");
        System.out.printf("%-15s", "Negara");
        System.out.printf("%-15s", "Nama");
        System.out.printf("%-10s", "Waktu");
        System.out.println("");
        for (int i = 0; i < listAtlet.length; i++) {
            System.out.printf("%-5s", (i + 1));
            System.out.printf("%-15s", listAtlet[i].getNegara());
            System.out.printf("%-15s", listAtlet[i].getNama());
            System.out.printf("%-10s", listAtlet[i].getWaktu());
            System.out.println("");
        }
    }

    public static Tugas2Atlet[] BubbleSortASC(Tugas2Atlet[] listAtlet) {
        for (int i = 0; i < listAtlet.length - 2; i++) {
            for (int j = 0; j < listAtlet.length - 1; j++) {
                if (listAtlet[j].compareTo(listAtlet[j + 1]) > 0) {
                    Tugas2Atlet swap = listAtlet[j];
                    listAtlet[j] = listAtlet[j + 1];
                    listAtlet[j + 1] = swap;
                }
            }
        }
        return listAtlet;
    }
    
    public static Tugas2Atlet[] BubbleSortDESC(Tugas2Atlet[] listAtlet) {
        for (int i = 0; i < listAtlet.length - 1; i++) {
            for (int j = 0; j < listAtlet.length - 1; j++) {
                if (listAtlet[j].compareTo(listAtlet[j + 1]) < 0) {
                    Tugas2Atlet swap = listAtlet[j];
                    listAtlet[j] = listAtlet[j + 1];
                    listAtlet[j + 1] = swap;
                }
            }
        }
        return listAtlet;
    }
    
     public static Tugas2Atlet[] selectionSortASC(Tugas2Atlet[] listAtlet) {
        for (int i = 0; i < listAtlet.length; i++) {
            int min = i;
            for (int j = i + 1; j < listAtlet.length; j++) {
                if (listAtlet[j].compareTo(listAtlet[min]) < 0) {
                    min = j;
                }
            }
            if (min != i) {
                Tugas2Atlet swap = listAtlet[min];
                listAtlet[min] = listAtlet[i];
                listAtlet[i] = swap;
            }
        }
        return listAtlet;
    }
    
   public static Tugas2Atlet[] selectionSortDESC(Tugas2Atlet[] listAtlet) {
        for (int i = 0; i < listAtlet.length; i++) {
            int min = i;
            for (int j = i + 1; j < listAtlet.length; j++) {
                if (listAtlet[j].compareTo(listAtlet[min]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                Tugas2Atlet swap = listAtlet[min];
                listAtlet[min] = listAtlet[i];
                listAtlet[i] = swap;
            }
        }
        return listAtlet;
    }
    
    public static Tugas2Atlet[] insertionSortASC(Tugas2Atlet[] listAtlet) {
        int holePosition;
        Tugas2Atlet valueToInsert;
        
        for (int i = 1; i < listAtlet.length; i++) {
            valueToInsert = listAtlet[i];
            holePosition = i;
            
            while (holePosition > 0 && listAtlet[holePosition - 1].compareTo(valueToInsert) < 0) {
                listAtlet[holePosition] = listAtlet[holePosition - 1];
                holePosition = holePosition - 1;
            }
            
            listAtlet[holePosition] = valueToInsert;
        }
        return listAtlet;
    }
    
    public static Tugas2Atlet[] insertionSortDESC(Tugas2Atlet[] listAtlet) {
        int holePosition;
        Tugas2Atlet valueToInsert;
        
        for (int i = 1; i < listAtlet.length; i++) {
            valueToInsert = listAtlet[i];
            holePosition = i;
            
            while (holePosition > 0 && listAtlet[holePosition - 1].compareTo(valueToInsert) > 0) {
                listAtlet[holePosition] = listAtlet[holePosition - 1];
                holePosition = holePosition - 1;
            }
            
            listAtlet[holePosition] = valueToInsert;
        }
        return listAtlet;
    }
}
