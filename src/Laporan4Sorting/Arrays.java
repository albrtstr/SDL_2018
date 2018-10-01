/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Nama : Albertus Satrio Bayuaji
 * NIM  : 175314082
 */
public class Arrays implements Comparable {

    private int nim;

    public Arrays() {

    }

    public Arrays(int nim) {
        this.nim = nim;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    @Override
    public int compareTo(Object o) {
        Arrays mhs = (Arrays) o;
        if (this.nim > mhs.getNim()) {
            return 1;
        }
        if (this.nim < mhs.getNim()) {
            return -1;
        } else {
            return 0;
        }
    }

    public static Arrays[] bubbleSort(Arrays[] data) {
        for (int i = 0; i < data.length - 2; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[i].compareTo(data[i + 1]) > 0) {
                    Arrays swap = data[i];
                    data[i] = data[i + 1];
                    data[i + 1] = data[i];
                }
            }
        }
        return data;
    }

}
