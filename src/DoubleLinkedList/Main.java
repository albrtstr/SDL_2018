/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoubleLinkedList;

/**
 *
 * @author basisb22
 */
public class Main {

    public static void main(String[] args) {
        LinkedList baru = new LinkedList();
        baru.addFirst(200);
        baru.addLast(100);
        baru.addLast(500);

        while (!baru.isEmpty()) {
            System.out.println(baru.removeFirst());
            
        }

        LinkedList baru1 = new LinkedList();
        System.out.println(baru1.toString());
        
        //System.out.println(baru.search(200));
        
        //Yang toString dan Searching belum selesai 
    }
}
