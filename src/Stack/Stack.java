/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author basisb32
 */
public class Stack {
    private int[] elemen;
    private int front;
    private int size;
    
    public Stack(){
        
    }

    public Stack(int[] elemen, int front, int size) {
        this.elemen = elemen;
        this.front = front;
        this.size = size;
    }
    
    public Stack(int ukuran){
        
    }
    
    public boolean push (int a){
        return false;
        
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
}
