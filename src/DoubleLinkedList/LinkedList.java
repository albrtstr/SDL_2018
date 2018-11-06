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
public class LinkedList {
    private ListNode head;
    private int size;
    
    public LinkedList(){
        this.head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size = 0;
    }
    
    private ListNode addBefore(int data, ListNode node){
        ListNode baru = new ListNode(data);
        node.getPrev().setNext(baru);
        baru.setPrev(node.getPrev());
        baru.setNext(node);
        node.setPrev(baru);
        return baru;
    }
    
    private int remove(ListNode node){
        ListNode kiri = node.getPrev();
        ListNode kanan = node.getNext();
//        kiri = node.getPrev();
//        kanan = node.getNext();
        kiri.setNext(kanan);
        kanan.setPrev(kiri);
        return node.getData();
    }
    
    public void addFirst(int data){
        addBefore(data, head.getNext());
        size++;
    }
    
    public void addLast(int data){
        addBefore(data, head);
        size++;
    }
    
    public int removeFirst(){
        int n = remove(head.getNext());
        size--;
        return n;
    }
    
    public int removeLast(){
        int n = remove(head.getPrev());
        size--;
        return n;
    }
    
    public ListNode search(int searchValue){
        ListNode temp = head;
        if (searchValue < size) {
            for (int i = 0; i < searchValue; i++) {
                temp = temp.getNext();
            }
        } else {
            System.out.println("Data Tidak Ada");
        }
        return temp;
    }
    
//    public ListNode searching(int searchValue){
//        ListNode cek = new ListNode();
//        boolean found = false;
//        if (isEmpty() == true) {
//            return null;
//        }else{
//            while (head.getNext() != null && !found) {
//                if () {
//                    
//                }
//            }
//        }
//    }
    
    public int size(){
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.getNext();
        }
        return count;
    }
    
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        ListNode node = head;
        String str = "";
        while (node != null) {
            str += remove(node);
            node = node.getNext();
        }
        return str;
    }
    
    
    
}
