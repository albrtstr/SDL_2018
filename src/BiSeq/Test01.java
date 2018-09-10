/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BiSeq;

import java.util.Arrays;

/**
 *
 * @author basisb12
 */
public class Test01 {

    public static void main(String[] args) {
        int[] data = {1, 2, 4, 7, 5, 9};
        
        System.out.print("Index = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i+" ");
        }
        
        System.out.println("");
        System.out.print("Data  = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
        }
        
        System.out.println("");
        int hasil1 = sequentialSearch(data, 5);
        System.out.println("Nilai 5 pada Sequential Search berada pada index ke = "+hasil1);
        
        int hasil2 = binarySearch(data, 5);
        System.out.println("Nilai 5 pada Binary Search berada pada index ke = "+hasil2);
    }

    public static int sequentialSearch(int[] data, int searchValue) {
        for (int i = 0; i < data.length; i++) {
            if (searchValue == data[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] data, int searchValue) {
        Arrays.sort(data);
        int indexAwal = 0;
        int indexAkhir = data.length - 1;
        while (indexAwal <= indexAkhir){
            int indexTengah = (indexAwal+indexAkhir)/2;
            if (data[indexTengah] == searchValue){
                return indexTengah;
            }
            else if (data[indexTengah] > searchValue){
                indexAkhir = indexTengah - 1;
            }
            else {
                indexAwal = indexTengah + 1;
            }
        }
        return -1;
    }
}
