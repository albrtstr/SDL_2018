/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackDinamis;

/**
 *
 * @author basisb23
 */
public class UjiCobaDinamis {
    public static void main(String[] args) {
        Stack test = new Stack();
        test.push(10);
        test.push(20);
        test.push(30);
        test.push(40);
        test.push(50);
        test.push(60);
        test.push(70);
        test.push(80);
        test.push(90);
        test.push(100);
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
    }
}
