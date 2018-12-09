/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interpolation;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class InterpolationSearch {
    public static void main(String[] args) {
        int[] data = {1, 2, 4, 7, 5, 9};
        int hasil = interSearch(data, 5);
        System.out.println("ada pada index = " +hasil);
    }
    
    public static int interSearch(int[] data, int searchValue){
        Arrays.sort(data);
        int indexAwal = 0;
        int indexAkhir = data.length -1;
        while (indexAwal <= indexAkhir) {
            int indexTengah = indexAwal + ((searchValue - data[indexAwal]) * (indexAkhir - indexAwal)) / (data[indexAkhir] - data[indexAwal]);
            if (data[indexTengah] == searchValue) {
                return indexTengah;
            } else if (data[indexTengah] > searchValue){
                indexAkhir = indexTengah - 1;
            } else{
                indexAwal = indexTengah +1;
            }
        }
        return -1;
    }
}
