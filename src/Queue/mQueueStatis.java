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
public class mQueueStatis {
    public static void main(String[] args) {
        QueueStatis test = new QueueStatis(3);
        test.enqueue(2);
        test.enqueue(4);
        test.enqueue(5);
        while (!test.isEmpty()) {
            System.out.println(test.dequeue());
        }
        
    }
}
