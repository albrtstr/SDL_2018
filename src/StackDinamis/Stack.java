/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackDinamis;

import DoubleLinkedList.LinkedList;



/**
 *
 * @author basisb23
 */
public class Stack {

    LinkedList tumpukan;

    public Stack(LinkedList tumpukan) {
        this.tumpukan = tumpukan;
    }

    public Stack() {
        tumpukan = new LinkedList();
    }

    public void push(int data) {
        tumpukan.addFirst(data);
    }

    public int pop() {
        return tumpukan.removeFirst();
    }

    public int size() {
        return tumpukan.size();
    }

    public boolean isEmpty() {
        return tumpukan.size() == 0;
    }
}
