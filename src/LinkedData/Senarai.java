/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedData;

import java.util.LinkedList;

/**
 *
 * @author ASUS
 */
public class Senarai {
     public static void main(String[] args) {

        LinkedList daftarNama = new LinkedList();

        daftarNama.add("Andi");
        daftarNama.add("Udin");
        daftarNama.add("Joko");
        daftarNama.add("Ridwan");
        daftarNama.addFirst("Susi");
        daftarNama.addLast("There");
        
        for (int i = 0; i < daftarNama.size(); i++) {
            System.out.println(daftarNama.get(i));
        }
        
        daftarNama.remove(2);
        
        System.out.println("");
        System.out.println(daftarNama.get(2));
    }
}
