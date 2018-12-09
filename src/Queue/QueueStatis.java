/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author basisb19
 */
public class QueueStatis {

    private int[] elemen;
    private int front;
    private int rear;
    private int size;

    public QueueStatis() {

    }

    public QueueStatis(int size) {
        elemen = new int[size];
    }

    public boolean enqueue(int elemen) {
        this.elemen[rear] = elemen;
        rear++;
        size++;
        return true;
    }

    public int dequeue() {
        if (!isEmpty()) {
            size--;
            int temp = elemen[front];
            front++;
            return temp;
        } else {
            return -1;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int[] getElemen() {
        return elemen;
    }

    public void setElemen(int[] elemen) {
        this.elemen = elemen;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return rear;
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
