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
        test.enqueue(10);
        test.enqueue(20);
        test.enqueue(30);
        test.enqueue(40);
        test.enqueue(50);
        test.enqueue(60);
        test.enqueue(70);
        test.enqueue(80);
        test.enqueue(90);
        test.enqueue(100);
        while (!test.isEmpty()) {
            System.out.println(test.dequeue());
        }
    }
}
