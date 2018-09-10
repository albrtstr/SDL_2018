/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SequentialSearch;

/**
 *
 * @author basisb21
 */
public class Test {
    public static void main(String[] args) {
        int [] x = {1, 3, 4, 2, 0, 9};
        System.out.print("Data x = ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+" ");
            System.out.print(i+" ");
        }
        int index = Hasil (x, 0);
        System.out.println(index);
        
        index = Hasil (x, 12);
        System.out.println(index);
        
    }
    
    public static int Hasil(int[] x, int target){
        for (int i = 0; i < x.length; i++) {
            if (x[i] == target) {
                //System.out.println(x[i]);
                return i;
            }
        }
        return 1;
    }
}
