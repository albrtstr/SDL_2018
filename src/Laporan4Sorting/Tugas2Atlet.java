/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Laporan4Sorting;

/**
 *
 * @author basisb22
 */
public class Tugas2Atlet implements Comparable{
    private String negara;
    private String Nama;
    private double waktu;
    
    public Tugas2Atlet (String negara, String Nama, double waktu){
        this.negara = negara;
        this.Nama = Nama;
        this.waktu = waktu;
    }

    public String getNegara() {
        return negara;
    }

    public void setNegara(String negara) {
        this.negara = negara;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public double getWaktu() {
        return waktu;
    }

    public void setWaktu(double waktu) {
        this.waktu = waktu;
    }
    
    
    @Override
    public int compareTo(Object o) {
        Tugas2Atlet atl = (Tugas2Atlet) o;
        if (waktu < atl.waktu) {
            return 1;
        } else if (waktu > atl.waktu) {
            return -1;
        } else {
            return 0;
        }
    }
    
}
