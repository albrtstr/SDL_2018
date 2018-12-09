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
public class QueueDinamis {
    private LinkedList antrian;

    public QueueDinamis() {
        antrian = new LinkedList();
    }
    
    public void enqueue(int elemen){
        antrian.addLast(elemen);
    }
    
    public int dequeue(){
        return antrian.removeFirst(); 
    }
    
    public int size(){
        return antrian.size();
    }
    
    public boolean isEmpty(){
        return antrian.size() == 0;
    }

    public LinkedList getAntrian() {
        return antrian;
    }

    public void setAntrian(LinkedList antrian) {
        this.antrian = antrian;
    }  
}
