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
public class Main {
    public static void main(String[] args) {
        LinkedList test = new LinkedList();
        
        test.addPertama(8);
        test.addPertama(15);
        test.addTerakhir(26);
        while (!test.isEmpty()) {
            ListNode baru = test.removePertama();
            System.out.println(baru.getData());
        }
    }
}
