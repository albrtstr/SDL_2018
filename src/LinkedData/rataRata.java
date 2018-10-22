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
public class rataRata {
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        data.add(150);
        data.add(185);
        data.add(160);
        data.add(168);
        data.add(170);
        data.add(150);
        
        int jml = 0;
        for (int i = 0; i < data.size(); i++) {
            int ubah = (int) data.get(i);
            jml = jml + ubah;
        }
        
        double rata = jml/data.size();
        System.out.println(rata);
    }
}
