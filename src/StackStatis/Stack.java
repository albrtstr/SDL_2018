/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackStatis;

/**
 *
 * @author basisb32
 */
public class Stack {

    private int[] elemen;
    private int front;
    private int size;

    public Stack() {

    }

    public Stack(int[] elemen, int front, int size) {
        this.elemen = elemen;
        this.front = front;
        this.size = size;
    }

    public Stack(int ukuran) {
        elemen = new int[ukuran];
        size = ukuran;
        front = 0;
    }

    public boolean push(int a) {
        elemen[front] = a;
        front++;
        return true;
    }

    public int pop() {
        if (!isEmpty()) {
            size--;
            front--;
            int a = elemen[front];
            return a;
        }
        return 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
