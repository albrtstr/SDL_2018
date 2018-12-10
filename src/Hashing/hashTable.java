/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hashing;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author ASUS
 */
public class hashTable {

    public static void main(String[] args) {
        Hashtable<String, Double> nilai = new Hashtable<>();
        nilai.put("Bayu", 90.2);
        nilai.put("Anti", 100.0);
        nilai.put("Anto", 98.1);

        //Menampilkan seluruh data
        for (Map.Entry<String, Double> data : nilai.entrySet()) {
            System.out.println("Nama = " + data.getKey() + " nilai = " + data.getValue());
        }
        //Menampilkan kunci tertentu
        String key = "Bayu";
        System.out.println("Nilai = " + nilai.get(key) + " nama = " + key);

        //Menampilkan total data
        System.out.println("Size = " + nilai.size());

        //Untuk mencari key
        if (nilai.containsKey(key)) {
            System.out.println("Nama = " + key + " " + "Nilai = " + nilai.get(key));
        } else {
            System.out.println("Key tidak ditemukan");
        }

        //Untuk menghapus table
        System.out.println("Jumlah data sebelum dihapus = " + nilai.size());
        nilai.clear();
        System.out.println("Jumlah data setelah dihapus = " + nilai.size());
        for (Map.Entry<String, Double> data : nilai.entrySet()) {
            System.out.println("Nama = " + data.getKey() + " nilai = " + data.getValue());
        }
        
        //Untuk menghapus berdasarkan key
        nilai.remove(key);
    }
}
