/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nov26_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author basisb12db
 */
public class test1 {
    public static void main(String[] args) {
        ArrayList<Integer> deret = new ArrayList<>();
        
        deret.add(50); deret.add(40); deret.add(30);
        deret.add(20); deret.add(10); deret.add(20);
        deret.add(30); deret.add(40); deret.add(50);
        
        System.out.println("Banyak bilangan = "+deret.size());
        for (int i = 0; i < deret.size(); i++) {
            System.out.print(deret.get(i)+" ");
        }
        
        System.out.println("");
        for (Iterator i = deret.iterator(); i.hasNext();) {
            System.out.print(i.next()+ " ");
        }
        
        System.out.println("");
        Iterator i = deret.iterator();
        while (i.hasNext()) {
            System.out.print(i.next()+ " ");
        }
        
        System.out.println("");
        for (Object n: deret) {
            System.out.print((int) n+" ");
        }
        
    }
}
