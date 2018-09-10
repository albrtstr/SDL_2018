/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package September10;

/**
 *
 * @author basisb20
 */
public class MainAtlet {
    public static void main(String[] args) {
        Atlet listAtlet [] = new Atlet [8];
        listAtlet[0] = new Atlet ("Sigit",  70);
        listAtlet[1] = new Atlet ("Purwanto", 80);
        listAtlet[2] = new Atlet ("Rudi", 75);
        listAtlet[3] = new Atlet ("Rendra", 90);
        listAtlet[4] = new Atlet ("Edi", 85);
        listAtlet[5] = new Atlet ("Gusti", 75);
        listAtlet[6] = new Atlet ("Bambang" , 95);
        listAtlet[7] = new Atlet ("Agung", 85);
        
        Atlet otherAtl = new Atlet("Budi", 78);
        
        System.out.printf("%-5s", "No.");
        System.out.printf("%-10s", "Nama");
        System.out.printf("%-10s", "Berat Badan");
        System.out.println("");
        for (int i = 0; i < listAtlet.length; i++) {
            System.out.printf("%-5s", (i+1));
            System.out.printf("%-14s", listAtlet[i].getNama());
            System.out.printf("%-10s", listAtlet[i].getBb());
            System.out.println("");
        }
        System.out.println("");
        
        System.out.println("Atlet Pembanding");
        System.out.printf("%-10s", otherAtl.getNama());
        System.out.printf("%-10s", otherAtl.getBb());
        search(listAtlet, otherAtl);
    }
    
    public static Atlet search (Atlet atl[], Atlet otherAtl){
        Atlet other = (Atlet) otherAtl;
        for (int i = 0; i < atl.length; i++) {
            if (atl[i].compareTo(otherAtl) == 0) {
                System.out.println("Berat badan " + otherAtl.getNama() + " sama dengan " + atl[i].getNama());
            } if (atl[i].compareTo(otherAtl) == -1){
                System.out.println("Berat badan " + otherAtl.getNama() + " lebih berat dari " + atl[i].getNama());
            } if (atl[i].compareTo(otherAtl) == 1){
                System.out.println("Berat badan " + otherAtl.getNama() + " lebih ringan dari " + atl[i].getNama());
            }
        }
        return otherAtl;
    }
}
