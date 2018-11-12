/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SearchDoublyLinkdList;

/**
 *
 * @author basisb22
 */
public class Main {

    public static void main(String[] args) {
        LinkedList value = new LinkedList();
        value.addFirst(10);
        value.addLast(20);
        value.addLast(30);
        
        System.out.println("Daftar Nilai \t\t\t= " + value.toString());
        //Method toString ini berfungsi untuk menampilkan seluruh elemen yang telah dimasukkan
        //dengan nilai yang dikembalikan adalah nilai semua elemen
        
        ListNode node = value.searchData(20);
        System.out.println("Cari data \t\t\t= " + node.getData());
        //Method searchData ini berfungsi untuk mencari elemen yang dicari. Pada Kasus ini elemen yang 
        //dicari adalah 20, maka nilai yang dikembalikan juga bernilai 20

        int index = value.searchIndex(20);
        System.out.println("Elemen " + node.getData() + " ada di di index \t= " + index);
        //Method searchIndex ini berfungsi untuk mencari elemen yang dicari berada pada index ke berapa.
        //Pada kasus ini elemen yang dicari adalah 20, maka nilai yang dikembalikan adalah 1, karena 
        //elemen 20 berada pada index ke-1

        int cari = value.get(1);
        System.out.println("Index " + index + " adalah \t\t\t= " + cari);
        //Method get ini berfungsi untuk mengeluarkan nilai dari index yang kita cari. Pada kasus ini
        //index yang dicari adalah 1, maka nilai yang dikembalikan adalah 20, karena isi dari index 1
        //adalah 20

    }
}
