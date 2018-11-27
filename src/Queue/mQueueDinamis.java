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
public class mQueueDinamis {
    public static void main(String[] args) {
        QueueDinamis test = new QueueDinamis();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(5);
        test.enqueue(3);
        while (!test.isEmpty()) {
            System.out.println(test.dequeue());
        }
    }
}
