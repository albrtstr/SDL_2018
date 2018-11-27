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
public class Main {

    public static void main(String[] args) {
        Stack test = new Stack();
        test.push(1);
        test.push(2);
        test.push(3);
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
    }
}
