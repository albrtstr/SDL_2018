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
public class Atlet implements Comparable{
    private String nama;
    private int bb;
    
    public Atlet (String nama, int bb){
        this.nama = nama;
        this.bb = bb;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }
    
    @Override
    public int compareTo (Object o){
        Atlet atl = (Atlet) o;
        if (bb < atl.bb){
            return 1;
        } else if (bb > atl.bb){
            return -1;
        } else{
            return 0;
        }
    }
    
}
