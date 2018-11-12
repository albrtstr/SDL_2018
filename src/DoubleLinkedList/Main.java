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
        LinkedList val = new LinkedList();
        val.addFirst(10);
        val.addLast(20);
        val.addLast(30);

        System.out.println(val.size());
        
        System.out.println("Daftar Nilai \t\t\t= " + val.toString());
        //Method toString yang berfungsi untuk menampilkan seluruh elemen 
        //dengan return 0
        ListNode node = val.searchData(20);
        System.out.println("Cari data \t\t\t= " + node.getData());

        int index = val.searchIndex(20);
        System.out.println("Elemen " + node.getData() + " ada di di index \t= " + index);

        int cari = val.get(1);
        System.out.println("Index " + index + " adalah \t\t\t= " + cari);

    }
}
