/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedData_DoubleLinkdList;

/**
 *
 * @author basisb22
 */
public class ListNode {
   private int data;
   private ListNode kanan;
   
   public ListNode(){
       
   }

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode(int data, ListNode kanan) {
        this.data = data;
        this.kanan = kanan;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getKanan() {
        return kanan;
    }

    public void setKanan(ListNode kanan) {
        this.kanan = kanan;
    }
    
    public void tampil(){
        System.out.println("{"+data+"}");
    }

    
   
   
}
