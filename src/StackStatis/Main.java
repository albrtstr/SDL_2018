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
public class Main {
    public static void main(String[] args) {
        Stack test = new Stack(3);
        test.push(56);
        test.push(45);
        test.push(67);
        while (!test.isEmpty()) {
            System.out.println(test.pop());
        }
    }
}
